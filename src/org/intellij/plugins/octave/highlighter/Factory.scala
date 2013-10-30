package org.intellij.plugins.octave.highlighter

import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import org.jetbrains.annotations.NotNull

/**
 * Syntax highlighter factory
 */
class Factory extends SyntaxHighlighterFactory {
  @NotNull override def getSyntaxHighlighter(project: Project, vf: VirtualFile) = new OctaveSyntaxHighlighter
}
