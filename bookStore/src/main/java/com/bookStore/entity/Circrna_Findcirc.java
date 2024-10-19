package com.bookStore.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Circrna_Findcirc {

    @Id
    private String chrom;
    private int start;
    private int end;
    private String name;
    private int  n_frags;
    private String strand;
    private double n_weight;
    private int n_spanned;
    private double n_uniq;

    public Circrna_Findcirc() {
    }

    public Circrna_Findcirc(String chrom, int start, int end, String name, int n_frags, String strand, double n_weight, int n_spanned, double n_uniq) {

        this.chrom = chrom;
        this.start = start;
        this.end = end;
        this.name = name;
        this.n_frags = n_frags;
        this.strand = strand;
        this.n_weight = n_weight;
        this.n_spanned = n_spanned;
        this.n_uniq = n_uniq;
    }

    public String getChrom() {
        return chrom;
    }

    public void setChrom(String chrom) {
        this.chrom = chrom;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getN_frags() {
        return n_frags;
    }

    public void setN_frags(int n_frags) {
        this.n_frags = n_frags;
    }

    public String getStrand() {
        return strand;
    }

    public void setStrand(String strand) {
        this.strand = strand;
    }

    public double getN_weight() {
        return n_weight;
    }

    public void setN_weight(double n_weight) {
        this.n_weight = n_weight;
    }

    public double getN_uniq() {
        return n_uniq;
    }

    public void setN_uniq(double n_uniq) {
        this.n_uniq = n_uniq;
    }

    public int getN_spanned() {
        return n_spanned;
    }

    public void setN_spanned(int n_spanned) {
        this.n_spanned = n_spanned;
    }
}
