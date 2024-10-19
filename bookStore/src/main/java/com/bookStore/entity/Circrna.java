package com.bookStore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Circrna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int chr;
    private String startCirc;
    private String endCirc;
    private String geneId;
    private String circId;

    private int junctionFragmentCount;

    private float junctionFPM;

    private float medianCirclen;

    private float fdr;

    public Circrna() {
        super();
    }

    public Circrna(int id, int chr, String startCirc, String endCirc, String geneId, String circId, int junctionFragmentCount, float junctionFPM, float medianCirclen, float fdr) {
        super();
        this.id = id;
        this.chr = chr;
        this.startCirc = startCirc;
        this.endCirc = endCirc;
        this.geneId = geneId;
        this.circId = circId;
        this.junctionFragmentCount = junctionFragmentCount;
        this.junctionFPM = junctionFPM;
        this.medianCirclen = medianCirclen;
        this.fdr = fdr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChr() {
        return chr;
    }

    public void setChr(int chr) {
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

    public float getJunctionFPM() {
        return junctionFPM;
    }

    public void setJunctionFPM(float junctionFPM) {
        this.junctionFPM = junctionFPM;
    }

    public float getMedianCirclen() {
        return medianCirclen;
    }

    public void setMedianCirclen(float medianCirclen) {
        this.medianCirclen = medianCirclen;
    }

    public float getFdr() {
        return fdr;
    }

    public void setFdr(float fdr) {
        this.fdr = fdr;
    }
}
