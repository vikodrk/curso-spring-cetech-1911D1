//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.01.26 a las 10:43:08 AM CST 
//


package com.client.calculator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="n1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="n2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "n1",
    "n2"
})
@XmlRootElement(name = "add")
public class Add {

    protected Integer n1;
    protected Integer n2;

    /**
     * Obtiene el valor de la propiedad n1.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getN1() {
        return n1;
    }

    /**
     * Define el valor de la propiedad n1.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setN1(Integer value) {
        this.n1 = value;
    }

    /**
     * Obtiene el valor de la propiedad n2.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getN2() {
        return n2;
    }

    /**
     * Define el valor de la propiedad n2.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setN2(Integer value) {
        this.n2 = value;
    }

}
