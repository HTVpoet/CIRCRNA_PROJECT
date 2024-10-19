package com.bookStore.DTO;

public class ChrCountDTO {
    private String chr;
    private Long count_chr;

    public ChrCountDTO(String chr, Long count_chr) {
        this.chr = chr;
        this.count_chr = count_chr;
    }

    public String getChr() {
        return chr;
    }

    public void setChr(String chr) {
        this.chr = chr;
    }

    public Long getCount_chr() {
        return count_chr;
    }

    public void setCount_chr(Long count_chr) {
        this.count_chr = count_chr;
    }
}
