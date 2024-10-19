package com.bookStore.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Circrna_Ciri {
    @Id
    private String circId;

    private String chr;

    private String startCirc;

    private String endCirc;

    private String geneId;

    private int junctionFragmentCount;

    private String SMS;

    private String circType;

    private String strand;

    private int nonJunctionFragmentCount;

    private double junctionRatio;

    private String patient_sample;

    public Circrna_Ciri() {
        super();
    }

    public Circrna_Ciri(String circId, String chr, String startCirc, String endCirc, String geneId, int junctionFragmentCount, String SMS, String circType, String strand, int nonJunctionFragmentCount, double junctionRatio, String patient_sample) {
        super();
        this.circId = circId;
        this.chr = chr;
        this.startCirc = startCirc;
        this.endCirc = endCirc;
        this.geneId = geneId;
        this.junctionFragmentCount = junctionFragmentCount;
        this.SMS = SMS;
        this.circType = circType;
        this.strand = strand;
        this.nonJunctionFragmentCount = nonJunctionFragmentCount;
        this.junctionRatio = junctionRatio;
        this.patient_sample = patient_sample;
    }

    public String getChr() {
        return chr;
    }

    public void setChr(String chr) {
        this.chr = chr;
    }

    public String getStartCirc() {
        return startCirc;
    }

    public void setStartCirc(String startCirc) {
        this.startCirc = startCirc;
    }

    public String getEndCirc() {
        return endCirc;
    }

    public void setEndCirc(String endCirc) {
        this.endCirc = endCirc;
    }

    public String getGeneId() {
        return geneId;
    }

    public void setGeneId(String geneId) {
        this.geneId = geneId;
    }

    public String getCircId() {
        return circId;
    }

    public void setCircId(String circId) {
        this.circId = circId;
    }

    public int getJunctionFragmentCount() {
        return junctionFragmentCount;
    }

    public void setJunctionFragmentCount(int junctionFragmentCount) {
        this.junctionFragmentCount = junctionFragmentCount;
    }

    public double getJunctionRatio() {
        return junctionRatio;
    }

    public void setJunctionRatio(double junctionRatio) {
        this.junctionRatio = junctionRatio;
    }

    public String getCircType() {
        return circType;
    }

    public void setCircType(String circType) {
        this.circType = circType;
    }

    public String getSMS() {
        return SMS;
    }

    public void setSMS(String SMS) {
        this.SMS = SMS;
    }

    public String getStrand() {
        return strand;
    }

    public void setStrand(String strand) {
        this.strand = strand;
    }

    public int getNonJunctionFragmentCount() {
        return nonJunctionFragmentCount;
    }

    public void setNonJunctionFragmentCount(int nonJunctionFragmentCount) {
        this.nonJunctionFragmentCount = nonJunctionFragmentCount;
    }

    public String getPatient_sample() {
        return patient_sample;
    }

    public void setPatient_sample(String patient_sample) {
        this.patient_sample = patient_sample;
    }
}
