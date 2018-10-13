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

// @Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
// public class AdminPage extends AdminSession implements Serializable {

//     public void adminLogin() {
//         // addDetailMessage("Logged in successfully as admin <b>" + email + "</b>");
//         Faces.redirect("index1.jsf");
//     }
// }