package com.pandawork.common.entity.answer;

import com.pandawork.core.common.entity.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author : kongyy
 * @time : 2018/7/31 20:48
 */
public class Answer {

    @Id
    private Integer id;

    @Column(name = "inquiry_answer1")
    private String inquiry_answer1;

    @Column(name = "inquiry_answer2")
    private String inquiry_answer2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInquiry_answer1() {
        return inquiry_answer1;
    }

    public void setInquiry_answer1(String inquiry_answer1) {
        this.inquiry_answer1 = inquiry_answer1;
    }

    public String getInquiry_answer2() {
        return inquiry_answer2;
    }

    public void setInquiry_answer2(String inquiry_answer2) {
        this.inquiry_answer2 = inquiry_answer2;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", inquiry_answer1='" + inquiry_answer1 + '\'' +
                ", inquiry_answer2='" + inquiry_answer2 + '\'' +
                '}';
    }


}
