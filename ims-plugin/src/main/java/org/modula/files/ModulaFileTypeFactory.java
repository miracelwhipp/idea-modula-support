package org.modula.files;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 18.05.13
 * Time: 09:51
 * To change this template use File | Settings | File Templates.
 */
public class ModulaFileTypeFactory extends FileTypeFactory {

	@Override
	public void createFileTypes(@NotNull FileTypeConsumer consumer) {
		consumer.consume(ModuleDefinitionType.INSTANCE);
		consumer.consume(ModuleImplementationType.INSTANCE);
		consumer.consume(PreprocessingInMemoryFileType.INSTANCE);
		consumer.consume(P1PreprocessingInMemoryFileType.INSTANCE);
	}
}
