package org.hl7.fhir.convertors.conv10_50;

import org.hl7.fhir.convertors.VersionConvertorConstants;
import org.hl7.fhir.convertors.VersionConvertor_10_50;
import org.hl7.fhir.dstu2.model.Reference;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r5.model.CodeType;
import org.hl7.fhir.r5.model.DataType;
import org.hl7.fhir.r5.model.Enumerations;
import org.hl7.fhir.r5.model.Enumerations.FHIRAllTypes;
import org.hl7.fhir.r5.model.Enumerations.SearchParamType;
import org.hl7.fhir.r5.model.StringType;
import org.hl7.fhir.utilities.Utilities;
import java.util.Collections;

public class OperationDefinition10_50 {

    public static org.hl7.fhir.dstu2.model.OperationDefinition convertOperationDefinition(org.hl7.fhir.r5.model.OperationDefinition src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.OperationDefinition tgt = new org.hl7.fhir.dstu2.model.OperationDefinition();
        VersionConvertor_10_50.copyDomainResource(src, tgt);
        if (src.hasUrlElement())
            tgt.setUrlElement((org.hl7.fhir.dstu2.model.UriType) VersionConvertor_10_50.convertType(src.getUrlElement()));
        if (src.hasVersionElement())
            tgt.setVersionElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_50.convertType(src.getVersionElement()));
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_50.convertType(src.getNameElement()));
        if (src.hasStatus()) {
            tgt.setStatus(VersionConvertor_10_50.convertConformanceResourceStatus(src.getStatus()));
        }
        if (src.hasKind()) {
            tgt.setKind(convertOperationKind(src.getKind()));
        }
        if (src.hasExperimentalElement())
            tgt.setExperimentalElement((org.hl7.fhir.dstu2.model.BooleanType) VersionConvertor_10_50.convertType(src.getExperimentalElement()));
        if (src.hasDateElement())
            tgt.setDateElement((org.hl7.fhir.dstu2.model.DateTimeType) VersionConvertor_10_50.convertType(src.getDateElement()));
        if (src.hasPublisherElement())
            tgt.setPublisherElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_50.convertType(src.getPublisherElement()));
        if (src.hasContact()) {
            for (org.hl7.fhir.r5.model.ContactDetail t : src.getContact()) tgt.addContact(convertOperationDefinitionContactComponent(t));
        }
        if (src.hasDescriptionElement())
            tgt.setDescriptionElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_50.convertType(src.getDescriptionElement()));
        if (src.hasPurposeElement()) {
            tgt.setRequirementsElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_50.convertType(src.getPurposeElement()));
        }
        if (src.hasAffectsState()) {
            tgt.setIdempotent(!src.getAffectsState());
        }
        if (src.hasCodeElement())
            tgt.setCodeElement((org.hl7.fhir.dstu2.model.CodeType) VersionConvertor_10_50.convertType(src.getCodeElement()));
        if (src.hasComment()) {
            tgt.setNotes(src.getComment());
        }
        if (src.hasBase())
            tgt.setBase(VersionConvertor_10_50.convertCanonicalToReference(src.getBaseElement()));
        if (src.hasSystemElement())
            tgt.setSystemElement((org.hl7.fhir.dstu2.model.BooleanType) VersionConvertor_10_50.convertType(src.getSystemElement()));
        if (src.getType())
            if (src.hasResource()) {
                for (CodeType t : src.getResource()) tgt.addType(t.getValue());
            }
        if (src.hasInstanceElement())
            tgt.setInstanceElement((org.hl7.fhir.dstu2.model.BooleanType) VersionConvertor_10_50.convertType(src.getInstanceElement()));
        if (src.hasParameter()) {
            for (org.hl7.fhir.r5.model.OperationDefinition.OperationDefinitionParameterComponent t : src.getParameter()) tgt.addParameter(convertOperationDefinitionParameterComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.r5.model.OperationDefinition convertOperationDefinition(org.hl7.fhir.dstu2.model.OperationDefinition src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.OperationDefinition tgt = new org.hl7.fhir.r5.model.OperationDefinition();
        VersionConvertor_10_50.copyDomainResource(src, tgt);
        if (src.hasUrlElement())
            tgt.setUrlElement((org.hl7.fhir.r5.model.UriType) VersionConvertor_10_50.convertType(src.getUrlElement()));
        if (src.hasVersionElement())
            tgt.setVersionElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_10_50.convertType(src.getVersionElement()));
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_10_50.convertType(src.getNameElement()));
        if (src.hasStatus()) {
            tgt.setStatus(VersionConvertor_10_50.convertConformanceResourceStatus(src.getStatus()));
        }
        if (src.hasKind()) {
            tgt.setKind(convertOperationKind(src.getKind()));
        }
        if (src.hasExperimentalElement())
            tgt.setExperimentalElement((org.hl7.fhir.r5.model.BooleanType) VersionConvertor_10_50.convertType(src.getExperimentalElement()));
        if (src.hasDateElement())
            tgt.setDateElement((org.hl7.fhir.r5.model.DateTimeType) VersionConvertor_10_50.convertType(src.getDateElement()));
        if (src.hasPublisherElement())
            tgt.setPublisherElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_10_50.convertType(src.getPublisherElement()));
        if (src.hasContact()) {
            for (org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionContactComponent t : src.getContact()) tgt.addContact(convertOperationDefinitionContactComponent(t));
        }
        if (src.hasDescriptionElement())
            tgt.setDescriptionElement((org.hl7.fhir.r5.model.MarkdownType) VersionConvertor_10_50.convertType(src.getDescriptionElement()));
        if (src.hasRequirements()) {
            tgt.setPurpose(src.getRequirements());
        }
        if (src.hasIdempotent())
            tgt.setAffectsState(!src.getIdempotent());
        if (src.hasCodeElement())
            tgt.setCodeElement((org.hl7.fhir.r5.model.CodeType) VersionConvertor_10_50.convertType(src.getCodeElement()));
        if (src.hasNotes()) {
            tgt.setComment(src.getNotes());
        }
        if (src.hasBase()) {
            tgt.setBaseElement(VersionConvertor_10_50.convertReferenceToCanonical(src.getBase()));
        }
        if (src.hasSystemElement())
            tgt.setSystemElement((org.hl7.fhir.r5.model.BooleanType) VersionConvertor_10_50.convertType(src.getSystemElement()));
        if (src.hasType()) {
            for (org.hl7.fhir.dstu2.model.CodeType t : src.getType()) tgt.addResource(t.getValue());
        }
        tgt.setType(tgt.hasResource());
        if (src.hasInstanceElement())
            tgt.setInstanceElement((org.hl7.fhir.r5.model.BooleanType) VersionConvertor_10_50.convertType(src.getInstanceElement()));
        if (src.hasParameter()) {
            for (org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionParameterComponent t : src.getParameter()) tgt.addParameter(convertOperationDefinitionParameterComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionContactComponent convertOperationDefinitionContactComponent(org.hl7.fhir.r5.model.ContactDetail src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionContactComponent tgt = new org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionContactComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_50.convertType(src.getNameElement()));
        if (src.hasTelecom()) {
            for (org.hl7.fhir.r5.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_10_50.convertContactPoint(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.r5.model.ContactDetail convertOperationDefinitionContactComponent(org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionContactComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.ContactDetail tgt = new org.hl7.fhir.r5.model.ContactDetail();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_10_50.convertType(src.getNameElement()));
        if (src.hasTelecom()) {
            for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_10_50.convertContactPoint(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionParameterBindingComponent convertOperationDefinitionParameterBindingComponent(org.hl7.fhir.r5.model.OperationDefinition.OperationDefinitionParameterBindingComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionParameterBindingComponent tgt = new org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionParameterBindingComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        tgt.setStrength(VersionConvertor_10_50.convertBindingStrength(src.getStrength()));
        if (src.hasValueSet()) {
            String vsr = VersionConvertorConstants.vsToRef(src.getValueSet());
            if (vsr != null)
                tgt.setValueSet(new org.hl7.fhir.dstu2.model.UriType(vsr));
            else
                tgt.setValueSet(new org.hl7.fhir.dstu2.model.Reference(src.getValueSet()));
        }
        return tgt;
    }

    public static org.hl7.fhir.r5.model.OperationDefinition.OperationDefinitionParameterBindingComponent convertOperationDefinitionParameterBindingComponent(org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionParameterBindingComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.OperationDefinition.OperationDefinitionParameterBindingComponent tgt = new org.hl7.fhir.r5.model.OperationDefinition.OperationDefinitionParameterBindingComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        tgt.setStrength(VersionConvertor_10_50.convertBindingStrength(src.getStrength()));
        DataType t = VersionConvertor_10_50.convertType(src.getValueSet());
        if (t != null) {
            if (t instanceof org.hl7.fhir.r5.model.Reference)
                tgt.setValueSet(((org.hl7.fhir.r5.model.Reference) t).getReference());
            else
                tgt.setValueSet(t.primitiveValue());
            tgt.setValueSet(VersionConvertorConstants.refToVS(tgt.getValueSet()));
        }
        return tgt;
    }

    public static org.hl7.fhir.r5.model.OperationDefinition.OperationDefinitionParameterComponent convertOperationDefinitionParameterComponent(org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionParameterComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.OperationDefinition.OperationDefinitionParameterComponent tgt = new org.hl7.fhir.r5.model.OperationDefinition.OperationDefinitionParameterComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.r5.model.CodeType) VersionConvertor_10_50.convertType(src.getNameElement()));
        if (src.hasUse()) {
            tgt.setUse(convertOperationParameterUse(src.getUse()));
        }
        if (src.hasMinElement())
          tgt.setMinElement((org.hl7.fhir.r5.model.IntegerType) VersionConvertor_10_50.convertType(src.getMinElement()));
        if (src.hasMaxElement())
          tgt.setMaxElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_10_50.convertType(src.getMaxElement()));
        if (src.hasDocumentationElement()) {
            tgt.setDocumentationElement((StringType) VersionConvertor_10_50.convertType(src.getDocumentationElement()));
        }
        if (Utilities.existsInList(src.getType(), "token", "reference", "composite", "number", "date", "quantity", "uri")) {
            tgt.setType(FHIRAllTypes.STRING);
            if (src.hasType()) {
                tgt.setSearchType(SearchParamType.fromCode(src.getType()));
            }
        } else {
            if (src.hasType()) {
                tgt.setType(Enumerations.FHIRAllTypes.fromCode(src.getType()));
            }
        }
        if (src.hasProfile()) {
            tgt.addTargetProfile(src.getProfile().getReference());
        }
        if (src.hasBinding()) {
            tgt.setBinding(convertOperationDefinitionParameterBindingComponent(src.getBinding()));
        }
        if (src.hasPart()) {
            for (org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionParameterComponent t : src.getPart()) tgt.addPart(convertOperationDefinitionParameterComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionParameterComponent convertOperationDefinitionParameterComponent(org.hl7.fhir.r5.model.OperationDefinition.OperationDefinitionParameterComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionParameterComponent tgt = new org.hl7.fhir.dstu2.model.OperationDefinition.OperationDefinitionParameterComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.dstu2.model.CodeType) VersionConvertor_10_50.convertType(src.getNameElement()));
        if (src.hasUse()) {
            tgt.setUse(convertOperationParameterUse(src.getUse()));
        }
        if (src.hasMinElement())
            tgt.setMinElement((org.hl7.fhir.dstu2.model.IntegerType) VersionConvertor_10_50.convertType(src.getMinElement()));
        if (src.hasMaxElement())
            tgt.setMaxElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_50.convertType(src.getMaxElement()));
        if (src.hasDocumentationElement())
            tgt.setDocumentationElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_50.convertType(src.getDocumentationElement()));
        if (src.hasSearchType()) {
            tgt.setType(src.getSearchType().toCode());
        } else
            tgt.setType(src.getType().toCode());
        if (src.hasTargetProfile()) {
            for (org.hl7.fhir.r5.model.UriType t : src.getTargetProfile()) tgt.setProfile(new Reference(t.getValue()));
        }
        if (src.hasBinding())
            tgt.setBinding(convertOperationDefinitionParameterBindingComponent(src.getBinding()));
        if (src.hasPart()) {
            for (org.hl7.fhir.r5.model.OperationDefinition.OperationDefinitionParameterComponent t : src.getPart()) tgt.addPart(convertOperationDefinitionParameterComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.r5.model.OperationDefinition.OperationKind convertOperationKind(org.hl7.fhir.dstu2.model.OperationDefinition.OperationKind src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case OPERATION:
                return org.hl7.fhir.r5.model.OperationDefinition.OperationKind.OPERATION;
            case QUERY:
                return org.hl7.fhir.r5.model.OperationDefinition.OperationKind.QUERY;
            default:
                return org.hl7.fhir.r5.model.OperationDefinition.OperationKind.NULL;
        }
    }

    public static org.hl7.fhir.dstu2.model.OperationDefinition.OperationKind convertOperationKind(org.hl7.fhir.r5.model.OperationDefinition.OperationKind src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case OPERATION:
                return org.hl7.fhir.dstu2.model.OperationDefinition.OperationKind.OPERATION;
            case QUERY:
                return org.hl7.fhir.dstu2.model.OperationDefinition.OperationKind.QUERY;
            default:
                return org.hl7.fhir.dstu2.model.OperationDefinition.OperationKind.NULL;
        }
    }

    public static org.hl7.fhir.r5.model.Enumerations.OperationParameterUse convertOperationParameterUse(org.hl7.fhir.dstu2.model.OperationDefinition.OperationParameterUse src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case IN:
                return org.hl7.fhir.r5.model.Enumerations.OperationParameterUse.IN;
            case OUT:
                return org.hl7.fhir.r5.model.Enumerations.OperationParameterUse.OUT;
            default:
                return org.hl7.fhir.r5.model.Enumerations.OperationParameterUse.NULL;
        }
    }

    public static org.hl7.fhir.dstu2.model.OperationDefinition.OperationParameterUse convertOperationParameterUse(org.hl7.fhir.r5.model.Enumerations.OperationParameterUse src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case IN:
                return org.hl7.fhir.dstu2.model.OperationDefinition.OperationParameterUse.IN;
            case OUT:
                return org.hl7.fhir.dstu2.model.OperationDefinition.OperationParameterUse.OUT;
            default:
                return org.hl7.fhir.dstu2.model.OperationDefinition.OperationParameterUse.NULL;
        }
    }
}