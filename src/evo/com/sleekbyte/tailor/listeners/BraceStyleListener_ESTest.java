/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 10 02:56:41 GMT 2024
 */

package com.sleekbyte.tailor.listeners;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sleekbyte.tailor.antlr.SwiftParser;
import com.sleekbyte.tailor.common.ColorSettings;
import com.sleekbyte.tailor.common.Severity;
import com.sleekbyte.tailor.format.CCFormatter;
import com.sleekbyte.tailor.format.Formatter;
import com.sleekbyte.tailor.format.HTMLFormatter;
import com.sleekbyte.tailor.format.JSONFormatter;
import com.sleekbyte.tailor.format.XcodeFormatter;
import com.sleekbyte.tailor.listeners.BraceStyleListener;
import com.sleekbyte.tailor.output.Printer;
import java.io.File;
import java.net.URI;
import java.util.LinkedList;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ListTokenSource;
import org.antlr.v4.runtime.ParserRuleContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BraceStyleListener_ESTest extends BraceStyleListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      File file0 = MockFile.createTempFile("FiIl[0BjL|N5=Iu)M", "FiIl[0BjL|N5=Iu)M");
      Severity severity0 = Severity.WARNING;
      ColorSettings colorSettings0 = new ColorSettings(false, false);
      HTMLFormatter hTMLFormatter0 = new HTMLFormatter(colorSettings0);
      Printer printer0 = new Printer(file0, severity0, hTMLFormatter0);
      LinkedList<CommonToken> linkedList0 = new LinkedList<CommonToken>();
      ListTokenSource listTokenSource0 = new ListTokenSource(linkedList0, "FiIl[0BjL|N5=Iu)M");
      BufferedTokenStream bufferedTokenStream0 = new BufferedTokenStream(listTokenSource0);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener(printer0, bufferedTokenStream0);
      SwiftParser.SubscriptDeclarationContext swiftParser_SubscriptDeclarationContext0 = new SwiftParser.SubscriptDeclarationContext((ParserRuleContext) null, 769);
      // Undeclared exception!
      try { 
        braceStyleListener0.enterSubscriptDeclaration(swiftParser_SubscriptDeclarationContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sleekbyte.tailor.utils.ListenerUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<CommonToken> linkedList0 = new LinkedList<CommonToken>();
      ListTokenSource listTokenSource0 = new ListTokenSource(linkedList0, "WmW`N -Qo-x!^<");
      CommonTokenStream commonTokenStream0 = new CommonTokenStream(listTokenSource0);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener((Printer) null, commonTokenStream0);
      SwiftParser.PostfixExpressionContext swiftParser_PostfixExpressionContext0 = new SwiftParser.PostfixExpressionContext();
      SwiftParser.SetterClauseContext swiftParser_SetterClauseContext0 = new SwiftParser.SetterClauseContext(swiftParser_PostfixExpressionContext0, (-1));
      // Undeclared exception!
      try { 
        braceStyleListener0.enterSetterClause(swiftParser_SetterClauseContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sleekbyte.tailor.utils.ParseTreeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("N=j(^ltqba%E/Y|j_#", "N=j(^ltqba%E/Y|j_#");
      Severity severity0 = Severity.WARNING;
      ColorSettings colorSettings0 = new ColorSettings(true, true);
      XcodeFormatter xcodeFormatter0 = new XcodeFormatter(colorSettings0);
      Printer printer0 = new Printer(mockFile0, severity0, xcodeFormatter0);
      LinkedList<CommonToken> linkedList0 = new LinkedList<CommonToken>();
      ListTokenSource listTokenSource0 = new ListTokenSource(linkedList0);
      CommonTokenStream commonTokenStream0 = new CommonTokenStream(listTokenSource0, 736);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener(printer0, commonTokenStream0);
      SwiftParser.GetterClauseContext swiftParser_GetterClauseContext0 = new SwiftParser.GetterClauseContext((ParserRuleContext) null, 805);
      // Undeclared exception!
      try { 
        braceStyleListener0.enterGetterClause(swiftParser_GetterClauseContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sleekbyte.tailor.listeners.BraceStyleListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("dA[^|($Io{L", "'/'");
      Severity severity0 = Severity.ERROR;
      ColorSettings colorSettings0 = new ColorSettings(false, true);
      HTMLFormatter hTMLFormatter0 = new HTMLFormatter(colorSettings0);
      Printer printer0 = new Printer(mockFile0, severity0, hTMLFormatter0);
      LinkedList<CommonToken> linkedList0 = new LinkedList<CommonToken>();
      ListTokenSource listTokenSource0 = new ListTokenSource(linkedList0);
      CommonTokenStream commonTokenStream0 = new CommonTokenStream(listTokenSource0);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener(printer0, commonTokenStream0);
      // Undeclared exception!
      try { 
        braceStyleListener0.enterFunctionDeclaration((SwiftParser.FunctionDeclarationContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sleekbyte.tailor.listeners.BraceStyleListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("hashCode not designed", "hashCode not designed");
      Severity severity0 = Severity.ERROR;
      ColorSettings colorSettings0 = new ColorSettings(false, true);
      HTMLFormatter hTMLFormatter0 = new HTMLFormatter(colorSettings0);
      Printer printer0 = new Printer(mockFile0, severity0, hTMLFormatter0);
      LinkedList<CommonToken> linkedList0 = new LinkedList<CommonToken>();
      ListTokenSource listTokenSource0 = new ListTokenSource(linkedList0, "");
      CommonTokenStream commonTokenStream0 = new CommonTokenStream(listTokenSource0);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener(printer0, commonTokenStream0);
      SwiftParser.ElseClauseContext swiftParser_ElseClauseContext0 = new SwiftParser.ElseClauseContext((ParserRuleContext) null, 447);
      braceStyleListener0.enterElseClause(swiftParser_ElseClauseContext0);
      assertEquals(0, swiftParser_ElseClauseContext0.getAltNumber());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      Severity severity0 = Severity.WARNING;
      ColorSettings colorSettings0 = new ColorSettings(false, false);
      CCFormatter cCFormatter0 = new CCFormatter(colorSettings0);
      Printer printer0 = new Printer(mockFile0, severity0, cCFormatter0);
      LinkedList<CommonToken> linkedList0 = new LinkedList<CommonToken>();
      ListTokenSource listTokenSource0 = new ListTokenSource(linkedList0, "YZ=Q_V");
      CommonTokenStream commonTokenStream0 = new CommonTokenStream(listTokenSource0);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener(printer0, commonTokenStream0);
      braceStyleListener0.enterClosureExpression((SwiftParser.ClosureExpressionContext) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("importKind");
      Severity severity0 = Severity.WARNING;
      ColorSettings colorSettings0 = new ColorSettings(false, false);
      CCFormatter cCFormatter0 = new CCFormatter(colorSettings0);
      Printer printer0 = new Printer(mockFile0, severity0, cCFormatter0);
      LinkedList<CommonToken> linkedList0 = new LinkedList<CommonToken>();
      ListTokenSource listTokenSource0 = new ListTokenSource(linkedList0);
      CommonTokenStream commonTokenStream0 = new CommonTokenStream(listTokenSource0);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener(printer0, commonTokenStream0);
      // Undeclared exception!
      try { 
        braceStyleListener0.enterGetterSetterBlock((SwiftParser.GetterSetterBlockContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sleekbyte.tailor.utils.ListenerUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("hashCode not designed", "hashCode not designed");
      Severity severity0 = Severity.ERROR;
      ColorSettings colorSettings0 = new ColorSettings(false, true);
      HTMLFormatter hTMLFormatter0 = new HTMLFormatter(colorSettings0);
      Printer printer0 = new Printer(mockFile0, severity0, hTMLFormatter0);
      LinkedList<CommonToken> linkedList0 = new LinkedList<CommonToken>();
      ListTokenSource listTokenSource0 = new ListTokenSource(linkedList0, "");
      CommonTokenStream commonTokenStream0 = new CommonTokenStream(listTokenSource0);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener(printer0, commonTokenStream0);
      // Undeclared exception!
      try { 
        braceStyleListener0.enterUnionStyleEnum((SwiftParser.UnionStyleEnumContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sleekbyte.tailor.listeners.BraceStyleListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("hashCode not designed", "hashCode not designed");
      Severity severity0 = Severity.ERROR;
      ColorSettings colorSettings0 = new ColorSettings(false, true);
      HTMLFormatter hTMLFormatter0 = new HTMLFormatter(colorSettings0);
      Printer printer0 = new Printer(mockFile0, severity0, hTMLFormatter0);
      LinkedList<CommonToken> linkedList0 = new LinkedList<CommonToken>();
      ListTokenSource listTokenSource0 = new ListTokenSource(linkedList0, "");
      CommonTokenStream commonTokenStream0 = new CommonTokenStream(listTokenSource0);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener(printer0, commonTokenStream0);
      SwiftParser.EnumCasePatternContext swiftParser_EnumCasePatternContext0 = new SwiftParser.EnumCasePatternContext((ParserRuleContext) null, 1051);
      SwiftParser.StatementContext swiftParser_StatementContext0 = new SwiftParser.StatementContext(swiftParser_EnumCasePatternContext0, (-1101));
      SwiftParser.DidSetClauseContext swiftParser_DidSetClauseContext0 = new SwiftParser.DidSetClauseContext(swiftParser_StatementContext0, (-161));
      // Undeclared exception!
      try { 
        braceStyleListener0.enterDidSetClause(swiftParser_DidSetClauseContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sleekbyte.tailor.utils.ParseTreeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      File file0 = MockFile.createTempFile("conformanceRequirement", "conformanceRequirement");
      Severity severity0 = Severity.ERROR;
      LinkedList<CommonToken> linkedList0 = new LinkedList<CommonToken>();
      ListTokenSource listTokenSource0 = new ListTokenSource(linkedList0, "conformanceRequirement");
      CommonTokenStream commonTokenStream0 = new CommonTokenStream(listTokenSource0, 1);
      JSONFormatter jSONFormatter0 = new JSONFormatter((ColorSettings) null);
      Printer printer0 = new Printer(file0, severity0, jSONFormatter0);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener(printer0, commonTokenStream0);
      // Undeclared exception!
      try { 
        braceStyleListener0.enterWhileStatement((SwiftParser.WhileStatementContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sleekbyte.tailor.listeners.BraceStyleListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<CommonToken> linkedList0 = new LinkedList<CommonToken>();
      ListTokenSource listTokenSource0 = new ListTokenSource(linkedList0);
      BufferedTokenStream bufferedTokenStream0 = new BufferedTokenStream(listTokenSource0);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener((Printer) null, bufferedTokenStream0);
      // Undeclared exception!
      try { 
        braceStyleListener0.enterElseClause((SwiftParser.ElseClauseContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sleekbyte.tailor.listeners.BraceStyleListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("MDh8");
      Severity severity0 = Severity.WARNING;
      ColorSettings colorSettings0 = new ColorSettings(true, false);
      CCFormatter cCFormatter0 = new CCFormatter(colorSettings0);
      Printer printer0 = new Printer(mockFile0, severity0, cCFormatter0);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener(printer0, (BufferedTokenStream) null);
      // Undeclared exception!
      try { 
        braceStyleListener0.enterWillSetClause((SwiftParser.WillSetClauseContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sleekbyte.tailor.listeners.BraceStyleListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Severity severity0 = Severity.WARNING;
      ColorSettings colorSettings0 = new ColorSettings(true, true);
      HTMLFormatter hTMLFormatter0 = new HTMLFormatter(colorSettings0);
      Printer printer0 = new Printer((File) null, severity0, hTMLFormatter0);
      LinkedList<CommonToken> linkedList0 = new LinkedList<CommonToken>();
      ListTokenSource listTokenSource0 = new ListTokenSource(linkedList0, ">^Vt-/L:/T");
      CommonTokenStream commonTokenStream0 = new CommonTokenStream(listTokenSource0);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener(printer0, commonTokenStream0);
      SwiftParser.FunctionDeclarationContext swiftParser_FunctionDeclarationContext0 = new SwiftParser.FunctionDeclarationContext((ParserRuleContext) null, 0);
      braceStyleListener0.enterFunctionDeclaration(swiftParser_FunctionDeclarationContext0);
      assertEquals(86, swiftParser_FunctionDeclarationContext0.getRuleIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Severity severity0 = Severity.WARNING;
      Printer printer0 = new Printer(mockFile0, severity0, (Formatter) null);
      LinkedList<CommonToken> linkedList0 = new LinkedList<CommonToken>();
      ListTokenSource listTokenSource0 = new ListTokenSource(linkedList0);
      BufferedTokenStream bufferedTokenStream0 = new BufferedTokenStream(listTokenSource0);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener(printer0, bufferedTokenStream0);
      SwiftParser.ProtocolBodyContext swiftParser_ProtocolBodyContext0 = new SwiftParser.ProtocolBodyContext((ParserRuleContext) null, 474);
      // Undeclared exception!
      try { 
        braceStyleListener0.enterProtocolBody(swiftParser_ProtocolBodyContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sleekbyte.tailor.utils.ListenerUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("HDWKI", "");
      Severity severity0 = Severity.WARNING;
      Printer printer0 = new Printer(mockFile0, severity0, (Formatter) null);
      LinkedList<CommonToken> linkedList0 = new LinkedList<CommonToken>();
      ListTokenSource listTokenSource0 = new ListTokenSource(linkedList0);
      BufferedTokenStream bufferedTokenStream0 = new BufferedTokenStream(listTokenSource0);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener(printer0, bufferedTokenStream0);
      // Undeclared exception!
      try { 
        braceStyleListener0.enterClassBody((SwiftParser.ClassBodyContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sleekbyte.tailor.utils.ListenerUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("balancedTokens", "balancedTokens");
      Severity severity0 = Severity.ERROR;
      ColorSettings colorSettings0 = new ColorSettings(false, false);
      XcodeFormatter xcodeFormatter0 = new XcodeFormatter(colorSettings0);
      Printer printer0 = new Printer(mockFile0, severity0, xcodeFormatter0);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener(printer0, (BufferedTokenStream) null);
      SwiftParser.ExtensionBodyContext swiftParser_ExtensionBodyContext0 = new SwiftParser.ExtensionBodyContext((ParserRuleContext) null, 0);
      // Undeclared exception!
      try { 
        braceStyleListener0.enterExtensionBody(swiftParser_ExtensionBodyContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sleekbyte.tailor.utils.ListenerUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Severity severity0 = Severity.WARNING;
      ColorSettings colorSettings0 = new ColorSettings(true, true);
      HTMLFormatter hTMLFormatter0 = new HTMLFormatter(colorSettings0);
      Printer printer0 = new Printer((File) null, severity0, hTMLFormatter0);
      LinkedList<CommonToken> linkedList0 = new LinkedList<CommonToken>();
      ListTokenSource listTokenSource0 = new ListTokenSource(linkedList0, ">^Vt-/L:/T");
      CommonTokenStream commonTokenStream0 = new CommonTokenStream(listTokenSource0);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener(printer0, commonTokenStream0);
      SwiftParser.ForInStatementContext swiftParser_ForInStatementContext0 = new SwiftParser.ForInStatementContext((ParserRuleContext) null, (-2210));
      // Undeclared exception!
      try { 
        braceStyleListener0.enterForInStatement(swiftParser_ForInStatementContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sleekbyte.tailor.listeners.BraceStyleListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Severity severity0 = Severity.WARNING;
      ColorSettings colorSettings0 = new ColorSettings(true, true);
      HTMLFormatter hTMLFormatter0 = new HTMLFormatter(colorSettings0);
      Printer printer0 = new Printer((File) null, severity0, hTMLFormatter0);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener(printer0, (BufferedTokenStream) null);
      SwiftParser.InitializerDeclarationContext swiftParser_InitializerDeclarationContext0 = new SwiftParser.InitializerDeclarationContext((ParserRuleContext) null, 593);
      // Undeclared exception!
      try { 
        braceStyleListener0.enterInitializerDeclaration(swiftParser_InitializerDeclarationContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sleekbyte.tailor.listeners.BraceStyleListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<CommonToken> linkedList0 = new LinkedList<CommonToken>();
      ListTokenSource listTokenSource0 = new ListTokenSource(linkedList0);
      BufferedTokenStream bufferedTokenStream0 = new BufferedTokenStream(listTokenSource0);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener((Printer) null, bufferedTokenStream0);
      SwiftParser.IdentifierListContext swiftParser_IdentifierListContext0 = new SwiftParser.IdentifierListContext((ParserRuleContext) null, 27);
      SwiftParser.IfStatementContext swiftParser_IfStatementContext0 = new SwiftParser.IfStatementContext(swiftParser_IdentifierListContext0, 27);
      // Undeclared exception!
      try { 
        braceStyleListener0.enterIfStatement(swiftParser_IfStatementContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sleekbyte.tailor.listeners.BraceStyleListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      File file0 = MockFile.createTempFile("conformanceRequirement", "conformanceRequirement");
      Severity severity0 = Severity.ERROR;
      XcodeFormatter xcodeFormatter0 = new XcodeFormatter((ColorSettings) null);
      Printer printer0 = new Printer(file0, severity0, xcodeFormatter0);
      LinkedList<CommonToken> linkedList0 = new LinkedList<CommonToken>();
      ListTokenSource listTokenSource0 = new ListTokenSource(linkedList0, "conformanceRequirement");
      SwiftParser.DeclarationContext swiftParser_DeclarationContext0 = new SwiftParser.DeclarationContext((ParserRuleContext) null, 0);
      CommonTokenStream commonTokenStream0 = new CommonTokenStream(listTokenSource0, 0);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener(printer0, commonTokenStream0);
      SwiftParser.StructBodyContext swiftParser_StructBodyContext0 = new SwiftParser.StructBodyContext(swiftParser_DeclarationContext0, 0);
      // Undeclared exception!
      try { 
        braceStyleListener0.enterStructBody(swiftParser_StructBodyContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sleekbyte.tailor.utils.ListenerUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("balancedTokens", "balancedTokens");
      Severity severity0 = Severity.WARNING;
      ColorSettings colorSettings0 = new ColorSettings(false, false);
      XcodeFormatter xcodeFormatter0 = new XcodeFormatter(colorSettings0);
      Printer printer0 = new Printer(mockFile0, severity0, xcodeFormatter0);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener(printer0, (BufferedTokenStream) null);
      SwiftParser.RepeatWhileStatementContext swiftParser_RepeatWhileStatementContext0 = new SwiftParser.RepeatWhileStatementContext((ParserRuleContext) null, 0);
      // Undeclared exception!
      try { 
        braceStyleListener0.enterRepeatWhileStatement(swiftParser_RepeatWhileStatementContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sleekbyte.tailor.utils.ListenerUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile(")$C]X?%");
      Severity severity0 = Severity.WARNING;
      ColorSettings colorSettings0 = new ColorSettings(false, false);
      HTMLFormatter hTMLFormatter0 = new HTMLFormatter(colorSettings0);
      Printer printer0 = new Printer(mockFile0, severity0, hTMLFormatter0);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener(printer0, (BufferedTokenStream) null);
      SwiftParser.RawValueStyleEnumContext swiftParser_RawValueStyleEnumContext0 = new SwiftParser.RawValueStyleEnumContext((ParserRuleContext) null, (-305));
      // Undeclared exception!
      try { 
        braceStyleListener0.enterRawValueStyleEnum(swiftParser_RawValueStyleEnumContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sleekbyte.tailor.listeners.BraceStyleListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockFile mockFile0 = new MockFile("p(R");
      Severity severity0 = Severity.ERROR;
      Printer printer0 = new Printer(mockFile0, severity0, (Formatter) null);
      LinkedList<CommonToken> linkedList0 = new LinkedList<CommonToken>();
      ListTokenSource listTokenSource0 = new ListTokenSource(linkedList0, (String) null);
      CommonTokenStream commonTokenStream0 = new CommonTokenStream(listTokenSource0, (-596));
      BraceStyleListener braceStyleListener0 = new BraceStyleListener(printer0, commonTokenStream0);
      SwiftParser.ArrayLiteralContext swiftParser_ArrayLiteralContext0 = new SwiftParser.ArrayLiteralContext((ParserRuleContext) null, (-596));
      SwiftParser.ProtocolAssociatedTypeDeclarationContext swiftParser_ProtocolAssociatedTypeDeclarationContext0 = new SwiftParser.ProtocolAssociatedTypeDeclarationContext(swiftParser_ArrayLiteralContext0, (-596));
      SwiftParser.WillSetDidSetBlockContext swiftParser_WillSetDidSetBlockContext0 = new SwiftParser.WillSetDidSetBlockContext(swiftParser_ProtocolAssociatedTypeDeclarationContext0, (-596));
      // Undeclared exception!
      try { 
        braceStyleListener0.enterWillSetDidSetBlock(swiftParser_WillSetDidSetBlockContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sleekbyte.tailor.utils.ListenerUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<CommonToken> linkedList0 = new LinkedList<CommonToken>();
      ListTokenSource listTokenSource0 = new ListTokenSource(linkedList0);
      BufferedTokenStream bufferedTokenStream0 = new BufferedTokenStream(listTokenSource0);
      BraceStyleListener braceStyleListener0 = new BraceStyleListener((Printer) null, bufferedTokenStream0);
      // Undeclared exception!
      try { 
        braceStyleListener0.enterSwitchStatement((SwiftParser.SwitchStatementContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.sleekbyte.tailor.listeners.BraceStyleListener", e);
      }
  }
}