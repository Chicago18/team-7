// package com.github.adminfaces.starter.infra.security;

// import com.github.adminfaces.template.session.AdminSession;
// import org.omnifaces.util.Faces;

// import javax.enterprise.context.SessionScoped;
// import javax.enterprise.inject.Specializes;
// import javax.faces.context.FacesContext;
// import javax.inject.Named;
// import java.io.IOException;
// import java.io.Serializable;

// import static com.github.adminfaces.starter.util.Utils.addDetailMessage;
// import org.springframework.context.annotation.Primary;
// import org.springframework.context.annotation.Scope;
// import org.springframework.context.annotation.ScopedProxyMode;

// /**
//  * Created by rmpestano on 12/20/14.
//  *
//  * This is just a login example.
//  *
//  * AdminSession uses isLoggedIn to determine if user must be redirect to login page or not.
//  * By default AdminSession isLoggedIn always resolves to true so it will not try to redirect user.
//  *
//  * If you already have your authorization mechanism which controls when user must be redirect to initial page or logon
//  * you can skip this class.
//  */
// @Named
// @SessionScoped
// @Specializes
// @Primary
// @Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
// public class RegistrationPage extends AdminSession implements Serializable {

//     private String currentUser;
//     private String email;
//     private String password;
//     private boolean remember;


//     public void goToRegistrationPage() throws IOException {
//         // addDetailMessage("Logged in successfully as Student: <b>" + email + "</b>");
//         Faces.getExternalContext().getFlash().setKeepMessages(true);
//         Faces.redirect("index4.jsf");
//     }

// }
