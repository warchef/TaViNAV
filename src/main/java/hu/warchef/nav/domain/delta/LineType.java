//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.31 at 04:47:15 PM CEST 
//


package hu.warchef.nav.domain.delta;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Field type including data of invoice items (product or service)
 * 
 * <p>Java class for LineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lineNumber" type="{http://schemas.nav.gov.hu/OSA/3.0/base}LineNumberType"/&gt;
 *         &lt;element name="lineModificationReference" type="{http://schemas.nav.gov.hu/OSA/3.0/data}LineModificationReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="referencesToOtherLines" type="{http://schemas.nav.gov.hu/OSA/3.0/data}ReferencesToOtherLinesType" minOccurs="0"/&gt;
 *         &lt;element name="advanceData" type="{http://schemas.nav.gov.hu/OSA/3.0/data}AdvanceDataType" minOccurs="0"/&gt;
 *         &lt;element name="productCodes" type="{http://schemas.nav.gov.hu/OSA/3.0/data}ProductCodesType" minOccurs="0"/&gt;
 *         &lt;element name="lineExpressionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="lineNatureIndicator" type="{http://schemas.nav.gov.hu/OSA/3.0/data}LineNatureIndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="lineDescription" type="{http://schemas.nav.gov.hu/NTCA/1.0/common}SimpleText512NotBlankType" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{http://schemas.nav.gov.hu/OSA/3.0/data}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasure" type="{http://schemas.nav.gov.hu/OSA/3.0/data}UnitOfMeasureType" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasureOwn" type="{http://schemas.nav.gov.hu/NTCA/1.0/common}SimpleText50NotBlankType" minOccurs="0"/&gt;
 *         &lt;element name="unitPrice" type="{http://schemas.nav.gov.hu/OSA/3.0/data}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="unitPriceHUF" type="{http://schemas.nav.gov.hu/OSA/3.0/data}QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="lineDiscountData" type="{http://schemas.nav.gov.hu/OSA/3.0/data}DiscountDataType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="lineAmountsNormal" type="{http://schemas.nav.gov.hu/OSA/3.0/data}LineAmountsNormalType" minOccurs="0"/&gt;
 *           &lt;element name="lineAmountsSimplified" type="{http://schemas.nav.gov.hu/OSA/3.0/data}LineAmountsSimplifiedType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="intermediatedService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="aggregateInvoiceLineData" type="{http://schemas.nav.gov.hu/OSA/3.0/data}AggregateInvoiceLineDataType" minOccurs="0"/&gt;
 *         &lt;element name="newTransportMean" type="{http://schemas.nav.gov.hu/OSA/3.0/data}NewTransportMeanType" minOccurs="0"/&gt;
 *         &lt;element name="depositIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="obligatedForProductFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GPCExcise" type="{http://schemas.nav.gov.hu/OSA/3.0/base}MonetaryType" minOccurs="0"/&gt;
 *         &lt;element name="dieselOilPurchase" type="{http://schemas.nav.gov.hu/OSA/3.0/data}DieselOilPurchaseType" minOccurs="0"/&gt;
 *         &lt;element name="netaDeclaration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="productFeeClause" type="{http://schemas.nav.gov.hu/OSA/3.0/data}ProductFeeClauseType" minOccurs="0"/&gt;
 *         &lt;element name="lineProductFeeContent" type="{http://schemas.nav.gov.hu/OSA/3.0/data}ProductFeeDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="conventionalLineInfo" type="{http://schemas.nav.gov.hu/OSA/3.0/data}ConventionalInvoiceInfoType" minOccurs="0"/&gt;
 *         &lt;element name="additionalLineData" type="{http://schemas.nav.gov.hu/OSA/3.0/data}AdditionalDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineType", namespace = "http://schemas.nav.gov.hu/OSA/3.0/data", propOrder = {
    "lineNumber",
    "lineModificationReference",
    "referencesToOtherLines",
    "advanceData",
    "productCodes",
    "lineExpressionIndicator",
    "lineNatureIndicator",
    "lineDescription",
    "quantity",
    "unitOfMeasure",
    "unitOfMeasureOwn",
    "unitPrice",
    "unitPriceHUF",
    "lineDiscountData",
    "lineAmountsNormal",
    "lineAmountsSimplified",
    "intermediatedService",
    "aggregateInvoiceLineData",
    "newTransportMean",
    "depositIndicator",
    "obligatedForProductFee",
    "gpcExcise",
    "dieselOilPurchase",
    "netaDeclaration",
    "productFeeClause",
    "lineProductFeeContent",
    "conventionalLineInfo",
    "additionalLineData"
})
public class LineType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger lineNumber;
    protected LineModificationReferenceType lineModificationReference;
    protected ReferencesToOtherLinesType referencesToOtherLines;
    protected AdvanceDataType advanceData;
    protected ProductCodesType productCodes;
    protected boolean lineExpressionIndicator;
    @XmlSchemaType(name = "string")
    protected LineNatureIndicatorType lineNatureIndicator;
    protected String lineDescription;
    protected BigDecimal quantity;
    @XmlSchemaType(name = "string")
    protected UnitOfMeasureType unitOfMeasure;
    protected String unitOfMeasureOwn;
    protected BigDecimal unitPrice;
    protected BigDecimal unitPriceHUF;
    protected DiscountDataType lineDiscountData;
    protected LineAmountsNormalType lineAmountsNormal;
    protected LineAmountsSimplifiedType lineAmountsSimplified;
    protected Boolean intermediatedService;
    protected AggregateInvoiceLineDataType aggregateInvoiceLineData;
    protected NewTransportMeanType newTransportMean;
    protected Boolean depositIndicator;
    protected Boolean obligatedForProductFee;
    @XmlElement(name = "GPCExcise")
    protected BigDecimal gpcExcise;
    protected DieselOilPurchaseType dieselOilPurchase;
    protected Boolean netaDeclaration;
    protected ProductFeeClauseType productFeeClause;
    protected List<ProductFeeDataType> lineProductFeeContent;
    protected ConventionalInvoiceInfoType conventionalLineInfo;
    protected List<AdditionalDataType> additionalLineData;

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineNumber(BigInteger value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the lineModificationReference property.
     * 
     * @return
     *     possible object is
     *     {@link LineModificationReferenceType }
     *     
     */
    public LineModificationReferenceType getLineModificationReference() {
        return lineModificationReference;
    }

    /**
     * Sets the value of the lineModificationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineModificationReferenceType }
     *     
     */
    public void setLineModificationReference(LineModificationReferenceType value) {
        this.lineModificationReference = value;
    }

    /**
     * Gets the value of the referencesToOtherLines property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencesToOtherLinesType }
     *     
     */
    public ReferencesToOtherLinesType getReferencesToOtherLines() {
        return referencesToOtherLines;
    }

    /**
     * Sets the value of the referencesToOtherLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencesToOtherLinesType }
     *     
     */
    public void setReferencesToOtherLines(ReferencesToOtherLinesType value) {
        this.referencesToOtherLines = value;
    }

    /**
     * Gets the value of the advanceData property.
     * 
     * @return
     *     possible object is
     *     {@link AdvanceDataType }
     *     
     */
    public AdvanceDataType getAdvanceData() {
        return advanceData;
    }

    /**
     * Sets the value of the advanceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvanceDataType }
     *     
     */
    public void setAdvanceData(AdvanceDataType value) {
        this.advanceData = value;
    }

    /**
     * Gets the value of the productCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCodesType }
     *     
     */
    public ProductCodesType getProductCodes() {
        return productCodes;
    }

    /**
     * Sets the value of the productCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCodesType }
     *     
     */
    public void setProductCodes(ProductCodesType value) {
        this.productCodes = value;
    }

    /**
     * Gets the value of the lineExpressionIndicator property.
     * 
     */
    public boolean isLineExpressionIndicator() {
        return lineExpressionIndicator;
    }

    /**
     * Sets the value of the lineExpressionIndicator property.
     * 
     */
    public void setLineExpressionIndicator(boolean value) {
        this.lineExpressionIndicator = value;
    }

    /**
     * Gets the value of the lineNatureIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link LineNatureIndicatorType }
     *     
     */
    public LineNatureIndicatorType getLineNatureIndicator() {
        return lineNatureIndicator;
    }

    /**
     * Sets the value of the lineNatureIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineNatureIndicatorType }
     *     
     */
    public void setLineNatureIndicator(LineNatureIndicatorType value) {
        this.lineNatureIndicator = value;
    }

    /**
     * Gets the value of the lineDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineDescription() {
        return lineDescription;
    }

    /**
     * Sets the value of the lineDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineDescription(String value) {
        this.lineDescription = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public UnitOfMeasureType getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasureType value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the unitOfMeasureOwn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasureOwn() {
        return unitOfMeasureOwn;
    }

    /**
     * Sets the value of the unitOfMeasureOwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasureOwn(String value) {
        this.unitOfMeasureOwn = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPrice(BigDecimal value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the unitPriceHUF property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPriceHUF() {
        return unitPriceHUF;
    }

    /**
     * Sets the value of the unitPriceHUF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPriceHUF(BigDecimal value) {
        this.unitPriceHUF = value;
    }

    /**
     * Gets the value of the lineDiscountData property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountDataType }
     *     
     */
    public DiscountDataType getLineDiscountData() {
        return lineDiscountData;
    }

    /**
     * Sets the value of the lineDiscountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountDataType }
     *     
     */
    public void setLineDiscountData(DiscountDataType value) {
        this.lineDiscountData = value;
    }

    /**
     * Gets the value of the lineAmountsNormal property.
     * 
     * @return
     *     possible object is
     *     {@link LineAmountsNormalType }
     *     
     */
    public LineAmountsNormalType getLineAmountsNormal() {
        return lineAmountsNormal;
    }

    /**
     * Sets the value of the lineAmountsNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineAmountsNormalType }
     *     
     */
    public void setLineAmountsNormal(LineAmountsNormalType value) {
        this.lineAmountsNormal = value;
    }

    /**
     * Gets the value of the lineAmountsSimplified property.
     * 
     * @return
     *     possible object is
     *     {@link LineAmountsSimplifiedType }
     *     
     */
    public LineAmountsSimplifiedType getLineAmountsSimplified() {
        return lineAmountsSimplified;
    }

    /**
     * Sets the value of the lineAmountsSimplified property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineAmountsSimplifiedType }
     *     
     */
    public void setLineAmountsSimplified(LineAmountsSimplifiedType value) {
        this.lineAmountsSimplified = value;
    }

    /**
     * Gets the value of the intermediatedService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntermediatedService() {
        return intermediatedService;
    }

    /**
     * Sets the value of the intermediatedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntermediatedService(Boolean value) {
        this.intermediatedService = value;
    }

    /**
     * Gets the value of the aggregateInvoiceLineData property.
     * 
     * @return
     *     possible object is
     *     {@link AggregateInvoiceLineDataType }
     *     
     */
    public AggregateInvoiceLineDataType getAggregateInvoiceLineData() {
        return aggregateInvoiceLineData;
    }

    /**
     * Sets the value of the aggregateInvoiceLineData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregateInvoiceLineDataType }
     *     
     */
    public void setAggregateInvoiceLineData(AggregateInvoiceLineDataType value) {
        this.aggregateInvoiceLineData = value;
    }

    /**
     * Gets the value of the newTransportMean property.
     * 
     * @return
     *     possible object is
     *     {@link NewTransportMeanType }
     *     
     */
    public NewTransportMeanType getNewTransportMean() {
        return newTransportMean;
    }

    /**
     * Sets the value of the newTransportMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewTransportMeanType }
     *     
     */
    public void setNewTransportMean(NewTransportMeanType value) {
        this.newTransportMean = value;
    }

    /**
     * Gets the value of the depositIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepositIndicator() {
        return depositIndicator;
    }

    /**
     * Sets the value of the depositIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepositIndicator(Boolean value) {
        this.depositIndicator = value;
    }

    /**
     * Gets the value of the obligatedForProductFee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isObligatedForProductFee() {
        return obligatedForProductFee;
    }

    /**
     * Sets the value of the obligatedForProductFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setObligatedForProductFee(Boolean value) {
        this.obligatedForProductFee = value;
    }

    /**
     * Gets the value of the gpcExcise property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGPCExcise() {
        return gpcExcise;
    }

    /**
     * Sets the value of the gpcExcise property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGPCExcise(BigDecimal value) {
        this.gpcExcise = value;
    }

    /**
     * Gets the value of the dieselOilPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link DieselOilPurchaseType }
     *     
     */
    public DieselOilPurchaseType getDieselOilPurchase() {
        return dieselOilPurchase;
    }

    /**
     * Sets the value of the dieselOilPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link DieselOilPurchaseType }
     *     
     */
    public void setDieselOilPurchase(DieselOilPurchaseType value) {
        this.dieselOilPurchase = value;
    }

    /**
     * Gets the value of the netaDeclaration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetaDeclaration() {
        return netaDeclaration;
    }

    /**
     * Sets the value of the netaDeclaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetaDeclaration(Boolean value) {
        this.netaDeclaration = value;
    }

    /**
     * Gets the value of the productFeeClause property.
     * 
     * @return
     *     possible object is
     *     {@link ProductFeeClauseType }
     *     
     */
    public ProductFeeClauseType getProductFeeClause() {
        return productFeeClause;
    }

    /**
     * Sets the value of the productFeeClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductFeeClauseType }
     *     
     */
    public void setProductFeeClause(ProductFeeClauseType value) {
        this.productFeeClause = value;
    }

    /**
     * Gets the value of the lineProductFeeContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineProductFeeContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineProductFeeContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductFeeDataType }
     * 
     * 
     */
    public List<ProductFeeDataType> getLineProductFeeContent() {
        if (lineProductFeeContent == null) {
            lineProductFeeContent = new ArrayList<ProductFeeDataType>();
        }
        return this.lineProductFeeContent;
    }

    /**
     * Gets the value of the conventionalLineInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ConventionalInvoiceInfoType }
     *     
     */
    public ConventionalInvoiceInfoType getConventionalLineInfo() {
        return conventionalLineInfo;
    }

    /**
     * Sets the value of the conventionalLineInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConventionalInvoiceInfoType }
     *     
     */
    public void setConventionalLineInfo(ConventionalInvoiceInfoType value) {
        this.conventionalLineInfo = value;
    }

    /**
     * Gets the value of the additionalLineData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalLineData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalLineData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalDataType }
     * 
     * 
     */
    public List<AdditionalDataType> getAdditionalLineData() {
        if (additionalLineData == null) {
            additionalLineData = new ArrayList<AdditionalDataType>();
        }
        return this.additionalLineData;
    }

}
