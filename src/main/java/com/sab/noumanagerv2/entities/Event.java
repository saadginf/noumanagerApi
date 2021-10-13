package com.sab.noumanagerv2.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Event {
    // ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // reference

    // objet
    private String title;
    // edition
    @NotBlank(message = "Champ Obligatoire")
    private String eventEdition;
    // bg color
    @NotBlank(message = "Champ Obligatoire")
    private String bgColor;
    // start date

    @NotNull(message = "Champ Obligatoire")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    // end Date

    @NotNull(message = "Champ Obligatoire")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    @ManyToOne
    @JoinColumn(name = "ID_COUNTRY")
    private Country country;

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the eventEdition
     */
    public String getEventEdition() {
        return eventEdition;
    }

    /**
     * @param eventEdition the eventEdition to set
     */
    public void setEventEdition(String eventEdition) {
        this.eventEdition = eventEdition;
    }

    /**
     * @return String return the bgColor
     */
    public String getBgColor() {
        return bgColor;
    }

    /**
     * @param bgColor the bgColor to set
     */
    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    /**
     * @return Date return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return Date return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Event() {
    }

    /**
     * @return Country return the country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

}
