package org.hl7.fhir.convertors.conv30_50;

import org.hl7.fhir.convertors.VersionConvertor_30_50;
import org.hl7.fhir.exceptions.FHIRException;

public class Medication30_50 {

    public static org.hl7.fhir.r5.model.Medication convertMedication(org.hl7.fhir.dstu3.model.Medication src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r5.model.Medication tgt = new org.hl7.fhir.r5.model.Medication();
        VersionConvertor_30_50.copyDomainResource(src, tgt);
        if (src.hasCode())
            tgt.setCode(VersionConvertor_30_50.convertCodeableConcept(src.getCode()));
        if (src.hasStatus())
            tgt.setStatus(convertMedicationStatus(src.getStatus()));
        if (src.hasManufacturer())
            tgt.setManufacturer(VersionConvertor_30_50.convertReference(src.getManufacturer()));
        if (src.hasForm())
            tgt.setDoseForm(VersionConvertor_30_50.convertCodeableConcept(src.getForm()));
        for (org.hl7.fhir.dstu3.model.Medication.MedicationIngredientComponent t : src.getIngredient()) tgt.addIngredient(convertMedicationIngredientComponent(t));
        if (src.hasPackage())
            tgt.setBatch(convertMedicationPackageBatchComponent(src.getPackage().getBatchFirstRep()));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.Medication convertMedication(org.hl7.fhir.r5.model.Medication src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.Medication tgt = new org.hl7.fhir.dstu3.model.Medication();
        VersionConvertor_30_50.copyDomainResource(src, tgt);
        if (src.hasCode())
            tgt.setCode(VersionConvertor_30_50.convertCodeableConcept(src.getCode()));
        if (src.hasStatus())
            tgt.setStatus(convertMedicationStatus(src.getStatus()));
        if (src.hasManufacturer())
            tgt.setManufacturer(VersionConvertor_30_50.convertReference(src.getManufacturer()));
        if (src.hasDoseForm())
            tgt.setForm(VersionConvertor_30_50.convertCodeableConcept(src.getDoseForm()));
        for (org.hl7.fhir.r5.model.Medication.MedicationIngredientComponent t : src.getIngredient()) tgt.addIngredient(convertMedicationIngredientComponent(t));
        if (src.hasBatch())
            tgt.getPackage().addBatch(convertMedicationPackageBatchComponent(src.getBatch()));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.Medication.MedicationIngredientComponent convertMedicationIngredientComponent(org.hl7.fhir.r5.model.Medication.MedicationIngredientComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.Medication.MedicationIngredientComponent tgt = new org.hl7.fhir.dstu3.model.Medication.MedicationIngredientComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasItem())
            tgt.setItem(VersionConvertor_30_50.convertType(src.getItem()));
        if (src.hasIsActive())
            tgt.setIsActive(src.getIsActive());
        if (src.hasStrengthRatio())
            tgt.setAmount(VersionConvertor_30_50.convertRatio(src.getStrengthRatio()));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.Medication.MedicationIngredientComponent convertMedicationIngredientComponent(org.hl7.fhir.dstu3.model.Medication.MedicationIngredientComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r5.model.Medication.MedicationIngredientComponent tgt = new org.hl7.fhir.r5.model.Medication.MedicationIngredientComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasItem())
            tgt.setItem(VersionConvertor_30_50.convertType(src.getItem()));
        if (src.hasIsActive())
            tgt.setIsActive(src.getIsActive());
        if (src.hasAmount())
            tgt.setStrength(VersionConvertor_30_50.convertRatio(src.getAmount()));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.Medication.MedicationPackageBatchComponent convertMedicationPackageBatchComponent(org.hl7.fhir.r5.model.Medication.MedicationBatchComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.Medication.MedicationPackageBatchComponent tgt = new org.hl7.fhir.dstu3.model.Medication.MedicationPackageBatchComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasLotNumber())
            tgt.setLotNumber(src.getLotNumber());
        if (src.hasExpirationDate())
            tgt.setExpirationDate(src.getExpirationDate());
        return tgt;
    }

    public static org.hl7.fhir.r5.model.Medication.MedicationBatchComponent convertMedicationPackageBatchComponent(org.hl7.fhir.dstu3.model.Medication.MedicationPackageBatchComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r5.model.Medication.MedicationBatchComponent tgt = new org.hl7.fhir.r5.model.Medication.MedicationBatchComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasLotNumber())
            tgt.setLotNumber(src.getLotNumber());
        if (src.hasExpirationDate())
            tgt.setExpirationDate(src.getExpirationDate());
        return tgt;
    }

    static public org.hl7.fhir.r5.model.Medication.MedicationStatusCodes convertMedicationStatus(org.hl7.fhir.dstu3.model.Medication.MedicationStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case ACTIVE:
                return org.hl7.fhir.r5.model.Medication.MedicationStatusCodes.ACTIVE;
            case INACTIVE:
                return org.hl7.fhir.r5.model.Medication.MedicationStatusCodes.INACTIVE;
            case ENTEREDINERROR:
                return org.hl7.fhir.r5.model.Medication.MedicationStatusCodes.ENTEREDINERROR;
            default:
                return org.hl7.fhir.r5.model.Medication.MedicationStatusCodes.NULL;
        }
    }

    static public org.hl7.fhir.dstu3.model.Medication.MedicationStatus convertMedicationStatus(org.hl7.fhir.r5.model.Medication.MedicationStatusCodes src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case ACTIVE:
                return org.hl7.fhir.dstu3.model.Medication.MedicationStatus.ACTIVE;
            case INACTIVE:
                return org.hl7.fhir.dstu3.model.Medication.MedicationStatus.INACTIVE;
            case ENTEREDINERROR:
                return org.hl7.fhir.dstu3.model.Medication.MedicationStatus.ENTEREDINERROR;
            default:
                return org.hl7.fhir.dstu3.model.Medication.MedicationStatus.NULL;
        }
    }
}
