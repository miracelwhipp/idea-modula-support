package org.modula.parsing.utility;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.Nullable;
import org.modula.parsing.definition.psi.*;

/**
 * Holds utility functions to obtain information from a Modula Psi Tree
 */
public final class ModulaPsiTraversingUtility {

    private ModulaPsiTraversingUtility() {
    }

    @Nullable
    public static String getModuleName(PsiElement psi) {

        if (null == psi) {
            return null;
        }

        PsiElement parent = getDefRootElement(psi);

        if (parent == null) {
            return null;
        }

        DefinitionDefinitionFile file = (DefinitionDefinitionFile) parent;

        DefinitionHeader header = file.getHeader();

        DefinitionModuleDefinition moduleDefinition;

        DefinitionGenericModuleDefinition genericModuleDefinition = header.getGenericModuleDefinition();
        if (null != genericModuleDefinition) {
            moduleDefinition = genericModuleDefinition.getModuleDefinition();
        } else {
            moduleDefinition = header.getModuleDefinition();
        }

        if (null == moduleDefinition) {
            return null;
        }

        return moduleDefinition.getModuleName().getText();
    }

    @Nullable
    public static DefinitionDefinitionFile getDefRootElement(PsiElement psi) {
        PsiElement parent = psi;
        while (!((parent = parent.getParent()) instanceof DefinitionDefinitionFile)) {
            if (null == parent) {
                return null;
            }
        }
        return (DefinitionDefinitionFile) parent;
    }


    public static String getFirstDefinedIdentifier(PsiElement element) {

        if (element instanceof DefinitionConstantDefinition) {
            return ((DefinitionConstantDefinition) element).getConstantName().getText();
        }

        if (element instanceof DefinitionOpaqueTypeDefinition) {
            return element.getText();
        }

        if (element instanceof DefinitionTypeAliasDefinition) {
            return ((DefinitionTypeAliasDefinition) element).getTypeName().getText();
        }

        if (element instanceof DefinitionProcedureDefinition) {
            return ((DefinitionProcedureDefinition) element).getProcedureName().getText();
        }

        if (element instanceof DefinitionVariableName) {
            return element.getText();
        }

        for (PsiElement child : element.getChildren()) {
            String firstIdentifier = getFirstDefinedIdentifier(child);
            if (firstIdentifier != null) {
                return firstIdentifier;
            }
        }

        return null;

    }

    @Nullable
    public static String getTypeName(DefinitionTypeDefinition psi) {

        DefinitionOpaqueTypeDefinition opaqueTypeDefinition = psi.getOpaqueTypeDefinition();

        if (null != opaqueTypeDefinition) {
            return opaqueTypeDefinition.getText();
        }

        DefinitionTypeAliasDefinition typeAliasDefinition = psi.getTypeAliasDefinition();
        if (null == typeAliasDefinition) {
            return null;
        }

        return typeAliasDefinition.getTypeName().getText();


    }

}
