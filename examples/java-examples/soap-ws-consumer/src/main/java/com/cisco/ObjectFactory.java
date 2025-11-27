
package com.cisco;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cisco package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Add_QNAME = new QName("http://cisco.com/", "add");
    private static final QName _AddResponse_QNAME = new QName("http://cisco.com/", "addResponse");
    private static final QName _Sub_QNAME = new QName("http://cisco.com/", "sub");
    private static final QName _SubResponse_QNAME = new QName("http://cisco.com/", "subResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cisco
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     * @return
     *     the new instance of {@link Add }
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     * @return
     *     the new instance of {@link AddResponse }
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link Sub }
     * 
     * @return
     *     the new instance of {@link Sub }
     */
    public Sub createSub() {
        return new Sub();
    }

    /**
     * Create an instance of {@link SubResponse }
     * 
     * @return
     *     the new instance of {@link SubResponse }
     */
    public SubResponse createSubResponse() {
        return new SubResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Add }{@code >}
     */
    @XmlElementDecl(namespace = "http://cisco.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cisco.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sub }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Sub }{@code >}
     */
    @XmlElementDecl(namespace = "http://cisco.com/", name = "sub")
    public JAXBElement<Sub> createSub(Sub value) {
        return new JAXBElement<>(_Sub_QNAME, Sub.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cisco.com/", name = "subResponse")
    public JAXBElement<SubResponse> createSubResponse(SubResponse value) {
        return new JAXBElement<>(_SubResponse_QNAME, SubResponse.class, null, value);
    }

}
