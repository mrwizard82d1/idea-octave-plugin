package org.intellij.plugins.octave.lang.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

%%

%class _OctaveLexer
%implements FlexLexer
%unicode
%public

%function advance
%type IElementType

// classes
D = [0-9]
S = [ \t]
NL = ((\n)|(\r)|(\r\n))
Im = [iIjJ]
CCHAR = [#%]
IDENT = ([_$a-zA-Z][_$a-zA-Z0-9]*)
EXPON = ([DdEe][+-]?{D}+)
NUMBER = (({D}+\.?{D}*{EXPON}?)|(\.{D}+{EXPON}?)|(0[xX][0-9a-fA-F]+))

ANY_INCLUDING_NL = (.|{NL})

%%
