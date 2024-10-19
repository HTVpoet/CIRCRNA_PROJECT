package com.bookStore.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Circrna_Circall {
    @Id
    private String circId;

    private String chr;

    private String startCirc;

    private String endCirc;

    private String geneId;

    private int junctionFragmentCount;

    private double junctionFPM;

    private double medianCirclen;

    private double fdr;

    private String patient_sample;

    public Circrna_Circall() {
        super();
    }

    public Circrna_Circall(String chr, String startCirc, String endCirc, String geneId, String circId, int junctionFragmentCount, double junctionFPM, double medianCirclen, double fdr, String patient_sample) {
        super();

        this.chr = chr;
        this.startCirc = startCirc;
        this.endCirc = endCirc;
        this.geneId = geneId;
        this.circId = circId;
        this.junctionFragmentCount = junctionFragmentCount;
        this.junctionFPM = junctionFPM;
        this.medianCirclen = medianCirclen;
        this.fdr = fdr;
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

    public double getJunctionFPM() {
        return junctionFPM;
    }

    public void setJunctionFPM(double junctionFPM) {
        this.junctionFPM = junctionFPM;
    }

    public double getMedianCirclen() {
        return medianCirclen;
    }

    public void setMedianCirclen(double medianCirclen) {
        this.medianCirclen = medianCirclen;
    }

    public double getFdr() {
        return fdr;
    }

    public void setFdr(double fdr) {
        this.fdr = fdr;
    }

    public String getPatient_sample() {
        return patient_sample;
    }

    public void setPatient_sample(String patient_sample) {
        this.patient_sample = patient_sample;
    }
}
