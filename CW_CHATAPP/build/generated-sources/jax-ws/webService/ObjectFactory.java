
package webService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webService package. 
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

    private final static QName _UserIdExists_QNAME = new QName("http://services.chatapp.com/", "user_id_exists");
    private final static QName _Login_QNAME = new QName("http://services.chatapp.com/", "login");
    private final static QName _AddUser_QNAME = new QName("http://services.chatapp.com/", "add_user");
    private final static QName _GetNicknameBasedOnUserID_QNAME = new QName("http://services.chatapp.com/", "getNicknameBasedOnUserID");
    private final static QName _LoginResponse_QNAME = new QName("http://services.chatapp.com/", "loginResponse");
    private final static QName _GetNicknameBasedOnUserIDResponse_QNAME = new QName("http://services.chatapp.com/", "getNicknameBasedOnUserIDResponse");
    private final static QName _UserIdExistsResponse_QNAME = new QName("http://services.chatapp.com/", "user_id_existsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNicknameBasedOnUserID }
     * 
     */
    public GetNicknameBasedOnUserID createGetNicknameBasedOnUserID() {
        return new GetNicknameBasedOnUserID();
    }

    /**
     * Create an instance of {@link GetNicknameBasedOnUserIDResponse }
     * 
     */
    public GetNicknameBasedOnUserIDResponse createGetNicknameBasedOnUserIDResponse() {
        return new GetNicknameBasedOnUserIDResponse();
    }

    /**
     * Create an instance of {@link UserIdExistsResponse }
     * 
     */
    public UserIdExistsResponse createUserIdExistsResponse() {
        return new UserIdExistsResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link UserIdExists }
     * 
     */
    public UserIdExists createUserIdExists() {
        return new UserIdExists();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserIdExists }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.chatapp.com/", name = "user_id_exists")
    public JAXBElement<UserIdExists> createUserIdExists(UserIdExists value) {
        return new JAXBElement<UserIdExists>(_UserIdExists_QNAME, UserIdExists.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.chatapp.com/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.chatapp.com/", name = "add_user")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNicknameBasedOnUserID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.chatapp.com/", name = "getNicknameBasedOnUserID")
    public JAXBElement<GetNicknameBasedOnUserID> createGetNicknameBasedOnUserID(GetNicknameBasedOnUserID value) {
        return new JAXBElement<GetNicknameBasedOnUserID>(_GetNicknameBasedOnUserID_QNAME, GetNicknameBasedOnUserID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.chatapp.com/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNicknameBasedOnUserIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.chatapp.com/", name = "getNicknameBasedOnUserIDResponse")
    public JAXBElement<GetNicknameBasedOnUserIDResponse> createGetNicknameBasedOnUserIDResponse(GetNicknameBasedOnUserIDResponse value) {
        return new JAXBElement<GetNicknameBasedOnUserIDResponse>(_GetNicknameBasedOnUserIDResponse_QNAME, GetNicknameBasedOnUserIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserIdExistsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.chatapp.com/", name = "user_id_existsResponse")
    public JAXBElement<UserIdExistsResponse> createUserIdExistsResponse(UserIdExistsResponse value) {
        return new JAXBElement<UserIdExistsResponse>(_UserIdExistsResponse_QNAME, UserIdExistsResponse.class, null, value);
    }

}
