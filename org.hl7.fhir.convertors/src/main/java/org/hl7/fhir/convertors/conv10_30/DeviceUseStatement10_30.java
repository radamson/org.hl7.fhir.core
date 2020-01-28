package org.hl7.fhir.convertors.conv10_30;

import org.hl7.fhir.convertors.VersionConvertor_10_30;
import org.hl7.fhir.dstu3.model.Annotation;
import org.hl7.fhir.exceptions.FHIRException;

public class DeviceUseStatement10_30 {

    public static org.hl7.fhir.dstu2.model.DeviceUseStatement convertDeviceUseStatement(org.hl7.fhir.dstu3.model.DeviceUseStatement src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.DeviceUseStatement tgt = new org.hl7.fhir.dstu2.model.DeviceUseStatement();
        VersionConvertor_10_30.copyDomainResource(src, tgt);
        tgt.setBodySite(VersionConvertor_10_30.convertType(src.getBodySite()));
        tgt.setWhenUsed(VersionConvertor_10_30.convertPeriod(src.getWhenUsed()));
        tgt.setDevice(VersionConvertor_10_30.convertReference(src.getDevice()));
        for (org.hl7.fhir.dstu3.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_10_30.convertIdentifier(t));
        for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getIndication()) tgt.addIndication(VersionConvertor_10_30.convertCodeableConcept(t));
        for (Annotation t : src.getNote()) tgt.addNotes(t.getText());
        tgt.setRecordedOn(src.getRecordedOn());
        tgt.setSubject(VersionConvertor_10_30.convertReference(src.getSubject()));
        tgt.setTiming(VersionConvertor_10_30.convertType(src.getTiming()));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.DeviceUseStatement convertDeviceUseStatement(org.hl7.fhir.dstu2.model.DeviceUseStatement src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu3.model.DeviceUseStatement tgt = new org.hl7.fhir.dstu3.model.DeviceUseStatement();
        VersionConvertor_10_30.copyDomainResource(src, tgt);
        if (src.hasBodySiteCodeableConcept())
            tgt.setBodySite(VersionConvertor_10_30.convertCodeableConcept(src.getBodySiteCodeableConcept()));
        tgt.setWhenUsed(VersionConvertor_10_30.convertPeriod(src.getWhenUsed()));
        tgt.setDevice(VersionConvertor_10_30.convertReference(src.getDevice()));
        for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_10_30.convertIdentifier(t));
        for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getIndication()) tgt.addIndication(VersionConvertor_10_30.convertCodeableConcept(t));
        for (org.hl7.fhir.dstu2.model.StringType t : src.getNotes()) tgt.addNote().setText(t.getValue());
        tgt.setRecordedOn(src.getRecordedOn());
        tgt.setSubject(VersionConvertor_10_30.convertReference(src.getSubject()));
        tgt.setTiming(VersionConvertor_10_30.convertType(src.getTiming()));
        return tgt;
    }
}
