package org.intellij.plugins.octave.highlighter

import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.lexer.Lexer

/**
 * Octave Syntax highlighter
 */
class OctaveSyntaxHighlighter extends SyntaxHighlighterBase {
  def getHighlightingLexer: Lexer = ???

  def getTokenHighlights(p1: IElementType): Array[TextAttributesKey] = ???
}
