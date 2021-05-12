// This is a generated file. Not intended for manual editing.
package se.ch.HAnS.codeAnnotation.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class CodeAnnotationVisitor extends PsiElementVisitor {

  public void visitBeginmarker(@NotNull CodeAnnotationBeginmarker o) {
    visitPsiElement(o);
  }

  public void visitEndmarker(@NotNull CodeAnnotationEndmarker o) {
    visitPsiElement(o);
  }

  public void visitFeature(@NotNull CodeAnnotationFeature o) {
    visitPsiElement(o);
  }

  public void visitLinemarker(@NotNull CodeAnnotationLinemarker o) {
    visitPsiElement(o);
  }

  public void visitLpq(@NotNull CodeAnnotationLpq o) {
    visitNamedElement(o);
  }

  public void visitParameter(@NotNull CodeAnnotationParameter o) {
    visitPsiElement(o);
  }

  public void visitNamedElement(@NotNull CodeAnnotationNamedElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
