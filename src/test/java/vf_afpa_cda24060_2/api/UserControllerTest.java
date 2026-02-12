//package vf_afpa_cda24060_2.api;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
//import org.springframework.test.context.bean.override.mockito.MockitoBean;
//import org.springframework.test.web.servlet.MockMvc;
//import vf_afpa_cda24060_2.api.controller.UserController;
//import vf_afpa_cda24060_2.api.service.UserService;
//import java.util.List;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//
//@WebMvcTest(UserController.class)
//public class UserControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockitoBean
//    private UserService userService;
//
//    @Test
//    public void testGetUsers() throws Exception {
//        when(userService.getAllUsers()).thenReturn(List.of());
//        mockMvc.perform(get("/users")).andExpect(status().isOk());
//    }
//}
