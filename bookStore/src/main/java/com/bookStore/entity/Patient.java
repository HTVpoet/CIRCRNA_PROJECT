package com.bookStore.entity;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {

    @Id
    private int patientId;

    private String labId;
    private String consensus_sex;
    private String inferred_sex;
    private String inferred_ethnicity;
    private String currentStage;
    private String mostRecentTreatmentDuration;
    private String vitalStatus;
    private String overallSurvival;
    private String causeOfDeath;
    private String Total_Protein;
    private String WBC_Count;
    private String any_different_cgs;
    private String any_different_cgs_also_beataml;
    private String different_cgs_lab_ids;


    public Patient() {
    }

    public Patient(int patientId, String labId, String consensus_sex, String inferred_sex, String inferred_ethnicity, String currentStage, String mostRecentTreatmentDuration, String vitalStatus, String overallSurvival, String causeOfDeath, String total_Protein, String WBC_Count, String any_different_cgs, String any_different_cgs_also_beataml, String different_cgs_lab_ids, String FLT3_ITD, String NPM1, String ABL1, String ASXL1, String ASXL2, String ATM, String BCOR, String BCORL1, String BRAF, String BRCA2, String CALR, String CBL, String CCND2, String CCND3, String CD36, String CEBPA, String CHEK2, String CIITA, String CREBBP, String CSF3R, String CTCF, String CUX1, String DNMT3A, String EP300, String ETV6, String EZH2, String FBXW7, String FLT3, String GATA1, String GATA2, String IDH1, String IDH2, String IKZF1, String JAK1, String JAK2, String JAK3, String KDM6A, String KIT, String KMT2A, String KMT2D, String KRAS, String MEN1, String MPL, String MUTYH, String MYD88, String NF1, String NOTCH1, String NRAS, String PAX5, String PDGFRB, String PHF6, String POT1, String PRDM1, String PTPN11, String RAD21, String ROS1, String RUNX1, String SETBP1, String SF3B1, String SMC1A, String SOCS1, String SRSF2, String STAG2, String STAT3, String SUZ12, String TCL1A, String TET2, String TP53, String TYK2, String u2AF1, String WT1, String ZRSR2) {
        this.patientId = patientId;
        this.labId = labId;
        this.consensus_sex = consensus_sex;
        this.inferred_sex = inferred_sex;
        this.inferred_ethnicity = inferred_ethnicity;
        this.currentStage = currentStage;
        this.mostRecentTreatmentDuration = mostRecentTreatmentDuration;
        this.vitalStatus = vitalStatus;
        this.overallSurvival = overallSurvival;
        this.causeOfDeath = causeOfDeath;
        Total_Protein = total_Protein;
        this.WBC_Count = WBC_Count;
        this.any_different_cgs = any_different_cgs;
        this.any_different_cgs_also_beataml = any_different_cgs_also_beataml;
        this.different_cgs_lab_ids = different_cgs_lab_ids;

    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getLabId() {
        return labId;
    }

    public void setLabId(String labId) {
        this.labId = labId;
    }

    public String getConsensus_sex() {
        return consensus_sex;
    }

    public void setConsensus_sex(String consensus_sex) {
        this.consensus_sex = consensus_sex;
    }

    public String getInferred_sex() {
        return inferred_sex;
    }

    public void setInferred_sex(String inferred_sex) {
        this.inferred_sex = inferred_sex;
    }

    public String getInferred_ethnicity() {
        return inferred_ethnicity;
    }

    public void setInferred_ethnicity(String inferred_ethnicity) {
        this.inferred_ethnicity = inferred_ethnicity;
    }

    public String getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
    }

    public String getMostRecentTreatmentDuration() {
        return mostRecentTreatmentDuration;
    }

    public void setMostRecentTreatmentDuration(String mostRecentTreatmentDuration) {
        this.mostRecentTreatmentDuration = mostRecentTreatmentDuration;
    }

    public String getVitalStatus() {
        return vitalStatus;
    }

    public void setVitalStatus(String vitalStatus) {
        this.vitalStatus = vitalStatus;
    }

    public String getOverallSurvival() {
        return overallSurvival;
    }

    public void setOverallSurvival(String overallSurvival) {
        this.overallSurvival = overallSurvival;
    }

    public String getCauseOfDeath() {
        return causeOfDeath;
    }

    public void setCauseOfDeath(String causeOfDeath) {
        this.causeOfDeath = causeOfDeath;
    }

    public String getTotal_Protein() {
        return Total_Protein;
    }

    public void setTotal_Protein(String total_Protein) {
        Total_Protein = total_Protein;
    }

    public String getWBC_Count() {
        return WBC_Count;
    }

    public void setWBC_Count(String WBC_Count) {
        this.WBC_Count = WBC_Count;
    }

    public String getAny_different_cgs() {
        return any_different_cgs;
    }

    public void setAny_different_cgs(String any_different_cgs) {
        this.any_different_cgs = any_different_cgs;
    }

    public String getAny_different_cgs_also_beataml() {
        return any_different_cgs_also_beataml;
    }

    public void setAny_different_cgs_also_beataml(String any_different_cgs_also_beataml) {
        this.any_different_cgs_also_beataml = any_different_cgs_also_beataml;
    }

    public String getDifferent_cgs_lab_ids() {
        return different_cgs_lab_ids;
    }

    public void setDifferent_cgs_lab_ids(String different_cgs_lab_ids) {
        this.different_cgs_lab_ids = different_cgs_lab_ids;
    }


}
