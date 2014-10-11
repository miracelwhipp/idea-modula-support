package org.modula.parsing;

import org.testng.Assert;
import org.modula.parsing.utility.BooleanStackSerializableAsShort;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SerializeBooleanStackTest {


	@Test(expectedExceptions = IllegalStateException.class)
	public void testToFull() {

		BooleanStackSerializableAsShort candidate = new BooleanStackSerializableAsShort();

		for (int i = 0; i < 20; i++) {
			candidate.push(false);
		}
	}

	@DataProvider
	public static Object[][] serializedStacks() {
		List<Object[]> ret = new ArrayList<Object[]>();

		for (int i = 1; i <= 0xFFFF; i += 0x1F) {
			short real = 0;
			real |= i;
			ret.add(new Object[]{real});
		}

		return ret.toArray(new Object[ret.size()][]);

	}

	@DataProvider
	public static Object[][] serializableStacks() {

		List<Object[]> ret = new ArrayList<Object[]>();

		for (int i = 1; i <= 0xFFFF; i += 0x1F) {
			ret.add(new Object[]{new BooleanStackSerializableAsShort(i)});
		}

		return ret.toArray(new Object[ret.size()][]);

	}


	@Test(dataProvider = "serializedStacks")
	public void testReserialization(short serialized) {

		BooleanStackSerializableAsShort deserialized = new BooleanStackSerializableAsShort(serialized);

		Assert.assertEquals(serialized, deserialized.serializeAsShort());

	}

	@Test(dataProvider = "serializableStacks")
	public void testSerializeByIteration(BooleanStackSerializableAsShort candidate) {

		short serialized = candidate.serializeAsShort();

		BooleanStackSerializableAsShort copy = new BooleanStackSerializableAsShort(serialized);

		while (!candidate.empty() && !copy.empty()) {
			Assert.assertEquals(candidate.pop(), copy.pop());
		}

		Assert.assertEquals(candidate.empty(), copy.empty());

	}

	@Test(dataProvider = "serializableStacks")
	public void testSerializeBySecondSerialization(BooleanStackSerializableAsShort candidate) {

		short serialized = candidate.serializeAsShort();

		BooleanStackSerializableAsShort copy = new BooleanStackSerializableAsShort();
		copy.initializeFromShort(serialized);

		Assert.assertEquals(serialized, copy.serializeAsShort());

	}


	@Test(dataProvider = "serializableStacks")
	public void testSerializeByComparingToString(BooleanStackSerializableAsShort candidate) {

		short serialized = candidate.serializeAsShort();

		BooleanStackSerializableAsShort copy = new BooleanStackSerializableAsShort();
		copy.initializeFromShort(serialized);

		Assert.assertEquals(candidate.toString(), copy.toString());


	}


}
