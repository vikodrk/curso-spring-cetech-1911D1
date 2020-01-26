
package a.b.c;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="n1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="n2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
