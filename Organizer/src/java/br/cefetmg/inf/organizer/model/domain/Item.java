/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.inf.organizer.model.domain;

import java.util.Date;

/**
 *
 * @author aline
 */
public class Item {
    
    private String nameItem;
    private String descriptionItem;
    private Date dateItem;
    private String identifierItem;
    private String identifierStatus;

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public void setDescriptionItem(String descriptionItem) {
        this.descriptionItem = descriptionItem;
    }

    public void setDateItem(Date dateItem) {
        this.dateItem = dateItem;
    }

    public void setIdentifierItem(String identifierItem) {
        this.identifierItem = identifierItem;
    }

    public void setIdentifierStatus(String identifierStatus) {
        this.identifierStatus = identifierStatus;
    }

    public String getNameItem() {
        return nameItem;
    }

    public String getDescriptionItem() {
        return descriptionItem;
    }

    public Date getDateItem() {
        return dateItem;
    }

    public String getIdentifierItem() {
        return identifierItem;
    }

    public String getIdentifierStatus() {
        return identifierStatus;
    }
    
}
