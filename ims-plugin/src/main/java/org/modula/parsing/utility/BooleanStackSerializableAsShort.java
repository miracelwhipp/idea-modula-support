package org.modula.parsing.utility;

import java.io.IOException;
import java.io.Serializable;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 04.12.13
 * Time: 17:13
 * To change this template use File | Settings | File Templates.
 */
public class BooleanStackSerializableAsShort implements BooleanStack, Serializable {

	private final Stack<Boolean> stack = new Stack<Boolean>();

	public BooleanStackSerializableAsShort() {
	}

	public BooleanStackSerializableAsShort(short serialized) {
		initializeFromShort(serialized);
	}

	public BooleanStackSerializableAsShort(int serialized) {
		short real = 0;
		real |= serialized;
		initializeFromShort(real);
	}

	@Override
	public void push(boolean value) {
		if (size() > 14) {
			throw new IllegalStateException("BooleanStackSerializableAsShort not serializable anymore");
		}
		stack.push(value);
	}

	@Override
	public boolean pop() {
		return stack.pop();
	}

	@Override
	public boolean top() {
		return stack.peek();
	}

	@Override
	public void top(boolean value) {
		stack.pop();
		stack.push(value);
	}

	@Override
	public int size() {
		return stack.size();
	}

	@Override
	public boolean empty() {
		return stack.empty();
	}

	public short serializeAsShort() {

		//mark highest position
		int ret = 1;

		for (Boolean current : stack) {
			ret = ret << 1;
			if (current) {
				ret++;
			}
		}

		short b = 0;
		b |= ret;

		return b;
	}

	public void initializeFromShort(short serializedAsShort) {


		int serialized = serializedAsShort & 0xFFFF;

		Stack<Boolean> reverse = new Stack<Boolean>();
		while (serialized > 0) {
			if (serialized > 1) {
				reverse.push(serialized % 2 == 1);
			}
			serialized = serialized >> 1;
		}

		stack.clear();

		while (!reverse.empty()) {
			stack.push(reverse.pop());
		}

	}

	private void writeObject(java.io.ObjectOutputStream stream)
			throws IOException {
		stream.writeShort(serializeAsShort());
	}

	private void readObject(java.io.ObjectInputStream stream)
			throws IOException, ClassNotFoundException {
		short serialized = stream.readShort();
		initializeFromShort(serialized);
	}

	@Override
	public String toString() {
		return "BooleanStackSerializableAsShort{stack=" + stack + '}';
	}
}
