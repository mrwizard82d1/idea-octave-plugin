package net.fmb.idea.octave.filetype

import com.intellij.openapi.fileTypes.{FileTypeConsumer, FileTypeFactory}
import org.jetbrains.annotations._

/**
 * Filetype factory controls which filetypes are exposed
 */
class Factory extends FileTypeFactory {
  override def createFileTypes(@NotNull consumer: FileTypeConsumer): Unit = {
    consumer.consume(MFileType)
  }
}