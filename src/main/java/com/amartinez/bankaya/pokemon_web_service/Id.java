//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.11.18 a las 02:00:49 AM CST 
//


package com.amartinez.bankaya.pokemon_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name_pokemon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "namePokemon"
})
@XmlRootElement(name = "id")
public class Id {

    @XmlElement(name = "name_pokemon", required = true)
    protected String namePokemon;

    /**
     * Obtiene el valor de la propiedad namePokemon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePokemon() {
        return namePokemon;
    }

    /**
     * Define el valor de la propiedad namePokemon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePokemon(String value) {
        this.namePokemon = value;
    }

}
