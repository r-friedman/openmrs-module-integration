//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.01 at 11:29:58 PM IST 
//


package org.openmrs.module.integration.api.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for OrgUnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrgUnitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="lastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgUnitType")
@XmlSeeAlso({
    org.openmrs.module.integration.api.jaxb.MetaData.OrganisationUnits.OrganisationUnit.class
})
public class OrgUnitType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlAttribute(name = "code", required = true)
    protected String code;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "created")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlAttribute(name = "lastUpdated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdated;
    @XmlAttribute(name = "shortName")
    protected String shortName;
    @XmlAttribute(name = "level")
    protected Byte level;
    @XmlAttribute(name = "href")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setLevel(Byte value) {
        this.level = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theCode;
            theCode = this.getCode();
            strategy.appendField(locator, this, "code", buffer, theCode);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            XMLGregorianCalendar theCreated;
            theCreated = this.getCreated();
            strategy.appendField(locator, this, "created", buffer, theCreated);
        }
        {
            XMLGregorianCalendar theLastUpdated;
            theLastUpdated = this.getLastUpdated();
            strategy.appendField(locator, this, "lastUpdated", buffer, theLastUpdated);
        }
        {
            String theShortName;
            theShortName = this.getShortName();
            strategy.appendField(locator, this, "shortName", buffer, theShortName);
        }
        {
            Byte theLevel;
            theLevel = this.getLevel();
            strategy.appendField(locator, this, "level", buffer, theLevel);
        }
        {
            String theHref;
            theHref = this.getHref();
            strategy.appendField(locator, this, "href", buffer, theHref);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OrgUnitType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OrgUnitType that = ((OrgUnitType) object);
        {
            String lhsCode;
            lhsCode = this.getCode();
            String rhsCode;
            rhsCode = that.getCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsCreated;
            lhsCreated = this.getCreated();
            XMLGregorianCalendar rhsCreated;
            rhsCreated = that.getCreated();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "created", lhsCreated), LocatorUtils.property(thatLocator, "created", rhsCreated), lhsCreated, rhsCreated)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsLastUpdated;
            lhsLastUpdated = this.getLastUpdated();
            XMLGregorianCalendar rhsLastUpdated;
            rhsLastUpdated = that.getLastUpdated();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastUpdated", lhsLastUpdated), LocatorUtils.property(thatLocator, "lastUpdated", rhsLastUpdated), lhsLastUpdated, rhsLastUpdated)) {
                return false;
            }
        }
        {
            String lhsShortName;
            lhsShortName = this.getShortName();
            String rhsShortName;
            rhsShortName = that.getShortName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shortName", lhsShortName), LocatorUtils.property(thatLocator, "shortName", rhsShortName), lhsShortName, rhsShortName)) {
                return false;
            }
        }
        {
            Byte lhsLevel;
            lhsLevel = this.getLevel();
            Byte rhsLevel;
            rhsLevel = that.getLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "level", lhsLevel), LocatorUtils.property(thatLocator, "level", rhsLevel), lhsLevel, rhsLevel)) {
                return false;
            }
        }
        {
            String lhsHref;
            lhsHref = this.getHref();
            String rhsHref;
            rhsHref = that.getHref();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "href", lhsHref), LocatorUtils.property(thatLocator, "href", rhsHref), lhsHref, rhsHref)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theCode;
            theCode = this.getCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            XMLGregorianCalendar theCreated;
            theCreated = this.getCreated();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "created", theCreated), currentHashCode, theCreated);
        }
        {
            XMLGregorianCalendar theLastUpdated;
            theLastUpdated = this.getLastUpdated();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastUpdated", theLastUpdated), currentHashCode, theLastUpdated);
        }
        {
            String theShortName;
            theShortName = this.getShortName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shortName", theShortName), currentHashCode, theShortName);
        }
        {
            Byte theLevel;
            theLevel = this.getLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "level", theLevel), currentHashCode, theLevel);
        }
        {
            String theHref;
            theHref = this.getHref();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "href", theHref), currentHashCode, theHref);
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof OrgUnitType) {
            final OrgUnitType copy = ((OrgUnitType) draftCopy);
            if (this.code!= null) {
                String sourceCode;
                sourceCode = this.getCode();
                String copyCode = ((String) strategy.copy(LocatorUtils.property(locator, "code", sourceCode), sourceCode));
                copy.setCode(copyCode);
            } else {
                copy.code = null;
            }
            if (this.name!= null) {
                String sourceName;
                sourceName = this.getName();
                String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                copy.setName(copyName);
            } else {
                copy.name = null;
            }
            if (this.created!= null) {
                XMLGregorianCalendar sourceCreated;
                sourceCreated = this.getCreated();
                XMLGregorianCalendar copyCreated = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "created", sourceCreated), sourceCreated));
                copy.setCreated(copyCreated);
            } else {
                copy.created = null;
            }
            if (this.lastUpdated!= null) {
                XMLGregorianCalendar sourceLastUpdated;
                sourceLastUpdated = this.getLastUpdated();
                XMLGregorianCalendar copyLastUpdated = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "lastUpdated", sourceLastUpdated), sourceLastUpdated));
                copy.setLastUpdated(copyLastUpdated);
            } else {
                copy.lastUpdated = null;
            }
            if (this.shortName!= null) {
                String sourceShortName;
                sourceShortName = this.getShortName();
                String copyShortName = ((String) strategy.copy(LocatorUtils.property(locator, "shortName", sourceShortName), sourceShortName));
                copy.setShortName(copyShortName);
            } else {
                copy.shortName = null;
            }
            if (this.level!= null) {
                Byte sourceLevel;
                sourceLevel = this.getLevel();
                Byte copyLevel = ((Byte) strategy.copy(LocatorUtils.property(locator, "level", sourceLevel), sourceLevel));
                copy.setLevel(copyLevel);
            } else {
                copy.level = null;
            }
            if (this.href!= null) {
                String sourceHref;
                sourceHref = this.getHref();
                String copyHref = ((String) strategy.copy(LocatorUtils.property(locator, "href", sourceHref), sourceHref));
                copy.setHref(copyHref);
            } else {
                copy.href = null;
            }
            if (this.id!= null) {
                String sourceId;
                sourceId = this.getId();
                String copyId = ((String) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId));
                copy.setId(copyId);
            } else {
                copy.id = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new OrgUnitType();
    }

}
