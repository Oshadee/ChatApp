
package com.chatapp.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chatapp.services package. 
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

    private final static QName _GetEntriesBasedOnThreadID_QNAME = new QName("http://services.chatapp.com/", "getEntriesBasedOnThreadID");
    private final static QName _SendMessage_QNAME = new QName("http://services.chatapp.com/", "sendMessage");
    private final static QName _GetLastEditedEntryBasedOnThreadIDResponse_QNAME = new QName("http://services.chatapp.com/", "getLastEditedEntryBasedOnThreadIDResponse");
    private final static QName _GetAllThreadsBasedOnThreadID_QNAME = new QName("http://services.chatapp.com/", "getAllThreadsBasedOnThreadID");
    private final static QName _GetAllThreadsResponse_QNAME = new QName("http://services.chatapp.com/", "getAllThreadsResponse");
    private final static QName _GetEntriesBasedOnThreadIDResponse_QNAME = new QName("http://services.chatapp.com/", "getEntriesBasedOnThreadIDResponse");
    private final static QName _GetAllThreadsBasedOnThreadIDResponse_QNAME = new QName("http://services.chatapp.com/", "getAllThreadsBasedOnThreadIDResponse");
    private final static QName _GetLastEditedEntryBasedOnThreadID_QNAME = new QName("http://services.chatapp.com/", "getLastEditedEntryBasedOnThreadID");
    private final static QName _ThreadTitleExists_QNAME = new QName("http://services.chatapp.com/", "threadTitleExists");
    private final static QName _CreateThread_QNAME = new QName("http://services.chatapp.com/", "create_thread");
    private final static QName _GetAllThreads_QNAME = new QName("http://services.chatapp.com/", "getAllThreads");
    private final static QName _ThreadTitleExistsResponse_QNAME = new QName("http://services.chatapp.com/", "threadTitleExistsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chatapp.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateThread }
     * 
     */
    public CreateThread createCreateThread() {
        return new CreateThread();
    }

    /**
     * Create an instance of {@link GetAllThreads }
     * 
     */
    public GetAllThreads createGetAllThreads() {
        return new GetAllThreads();
    }

    /**
     * Create an instance of {@link ThreadTitleExistsResponse }
     * 
     */
    public ThreadTitleExistsResponse createThreadTitleExistsResponse() {
        return new ThreadTitleExistsResponse();
    }

    /**
     * Create an instance of {@link GetEntriesBasedOnThreadID }
     * 
     */
    public GetEntriesBasedOnThreadID createGetEntriesBasedOnThreadID() {
        return new GetEntriesBasedOnThreadID();
    }

    /**
     * Create an instance of {@link SendMessage }
     * 
     */
    public SendMessage createSendMessage() {
        return new SendMessage();
    }

    /**
     * Create an instance of {@link GetAllThreadsBasedOnThreadID }
     * 
     */
    public GetAllThreadsBasedOnThreadID createGetAllThreadsBasedOnThreadID() {
        return new GetAllThreadsBasedOnThreadID();
    }

    /**
     * Create an instance of {@link GetAllThreadsResponse }
     * 
     */
    public GetAllThreadsResponse createGetAllThreadsResponse() {
        return new GetAllThreadsResponse();
    }

    /**
     * Create an instance of {@link GetEntriesBasedOnThreadIDResponse }
     * 
     */
    public GetEntriesBasedOnThreadIDResponse createGetEntriesBasedOnThreadIDResponse() {
        return new GetEntriesBasedOnThreadIDResponse();
    }

    /**
     * Create an instance of {@link GetLastEditedEntryBasedOnThreadIDResponse }
     * 
     */
    public GetLastEditedEntryBasedOnThreadIDResponse createGetLastEditedEntryBasedOnThreadIDResponse() {
        return new GetLastEditedEntryBasedOnThreadIDResponse();
    }

    /**
     * Create an instance of {@link GetAllThreadsBasedOnThreadIDResponse }
     * 
     */
    public GetAllThreadsBasedOnThreadIDResponse createGetAllThreadsBasedOnThreadIDResponse() {
        return new GetAllThreadsBasedOnThreadIDResponse();
    }

    /**
     * Create an instance of {@link GetLastEditedEntryBasedOnThreadID }
     * 
     */
    public GetLastEditedEntryBasedOnThreadID createGetLastEditedEntryBasedOnThreadID() {
        return new GetLastEditedEntryBasedOnThreadID();
    }

    /**
     * Create an instance of {@link ThreadTitleExists }
     * 
     */
    public ThreadTitleExists createThreadTitleExists() {
        return new ThreadTitleExists();
    }

    /**
     * Create an instance of {@link UserInfo }
     * 
     */
    public UserInfo createUserInfo() {
        return new UserInfo();
    }

    /**
     * Create an instance of {@link ThreadInfo }
     * 
     */
    public ThreadInfo createThreadInfo() {
        return new ThreadInfo();
    }

    /**
     * Create an instance of {@link ThreadTypeInfo }
     * 
     */
    public ThreadTypeInfo createThreadTypeInfo() {
        return new ThreadTypeInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntriesBasedOnThreadID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.chatapp.com/", name = "getEntriesBasedOnThreadID")
    public JAXBElement<GetEntriesBasedOnThreadID> createGetEntriesBasedOnThreadID(GetEntriesBasedOnThreadID value) {
        return new JAXBElement<GetEntriesBasedOnThreadID>(_GetEntriesBasedOnThreadID_QNAME, GetEntriesBasedOnThreadID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.chatapp.com/", name = "sendMessage")
    public JAXBElement<SendMessage> createSendMessage(SendMessage value) {
        return new JAXBElement<SendMessage>(_SendMessage_QNAME, SendMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastEditedEntryBasedOnThreadIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.chatapp.com/", name = "getLastEditedEntryBasedOnThreadIDResponse")
    public JAXBElement<GetLastEditedEntryBasedOnThreadIDResponse> createGetLastEditedEntryBasedOnThreadIDResponse(GetLastEditedEntryBasedOnThreadIDResponse value) {
        return new JAXBElement<GetLastEditedEntryBasedOnThreadIDResponse>(_GetLastEditedEntryBasedOnThreadIDResponse_QNAME, GetLastEditedEntryBasedOnThreadIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllThreadsBasedOnThreadID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.chatapp.com/", name = "getAllThreadsBasedOnThreadID")
    public JAXBElement<GetAllThreadsBasedOnThreadID> createGetAllThreadsBasedOnThreadID(GetAllThreadsBasedOnThreadID value) {
        return new JAXBElement<GetAllThreadsBasedOnThreadID>(_GetAllThreadsBasedOnThreadID_QNAME, GetAllThreadsBasedOnThreadID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllThreadsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.chatapp.com/", name = "getAllThreadsResponse")
    public JAXBElement<GetAllThreadsResponse> createGetAllThreadsResponse(GetAllThreadsResponse value) {
        return new JAXBElement<GetAllThreadsResponse>(_GetAllThreadsResponse_QNAME, GetAllThreadsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntriesBasedOnThreadIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.chatapp.com/", name = "getEntriesBasedOnThreadIDResponse")
    public JAXBElement<GetEntriesBasedOnThreadIDResponse> createGetEntriesBasedOnThreadIDResponse(GetEntriesBasedOnThreadIDResponse value) {
        return new JAXBElement<GetEntriesBasedOnThreadIDResponse>(_GetEntriesBasedOnThreadIDResponse_QNAME, GetEntriesBasedOnThreadIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllThreadsBasedOnThreadIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.chatapp.com/", name = "getAllThreadsBasedOnThreadIDResponse")
    public JAXBElement<GetAllThreadsBasedOnThreadIDResponse> createGetAllThreadsBasedOnThreadIDResponse(GetAllThreadsBasedOnThreadIDResponse value) {
        return new JAXBElement<GetAllThreadsBasedOnThreadIDResponse>(_GetAllThreadsBasedOnThreadIDResponse_QNAME, GetAllThreadsBasedOnThreadIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastEditedEntryBasedOnThreadID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.chatapp.com/", name = "getLastEditedEntryBasedOnThreadID")
    public JAXBElement<GetLastEditedEntryBasedOnThreadID> createGetLastEditedEntryBasedOnThreadID(GetLastEditedEntryBasedOnThreadID value) {
        return new JAXBElement<GetLastEditedEntryBasedOnThreadID>(_GetLastEditedEntryBasedOnThreadID_QNAME, GetLastEditedEntryBasedOnThreadID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThreadTitleExists }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.chatapp.com/", name = "threadTitleExists")
    public JAXBElement<ThreadTitleExists> createThreadTitleExists(ThreadTitleExists value) {
        return new JAXBElement<ThreadTitleExists>(_ThreadTitleExists_QNAME, ThreadTitleExists.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateThread }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.chatapp.com/", name = "create_thread")
    public JAXBElement<CreateThread> createCreateThread(CreateThread value) {
        return new JAXBElement<CreateThread>(_CreateThread_QNAME, CreateThread.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllThreads }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.chatapp.com/", name = "getAllThreads")
    public JAXBElement<GetAllThreads> createGetAllThreads(GetAllThreads value) {
        return new JAXBElement<GetAllThreads>(_GetAllThreads_QNAME, GetAllThreads.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThreadTitleExistsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.chatapp.com/", name = "threadTitleExistsResponse")
    public JAXBElement<ThreadTitleExistsResponse> createThreadTitleExistsResponse(ThreadTitleExistsResponse value) {
        return new JAXBElement<ThreadTitleExistsResponse>(_ThreadTitleExistsResponse_QNAME, ThreadTitleExistsResponse.class, null, value);
    }

}
