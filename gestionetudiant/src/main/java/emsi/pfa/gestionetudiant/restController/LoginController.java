package emsi.pfa.gestionetudiant.restController;

 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 @RestController
 public class LoginController {
	 @RequestMapping("/login/{username}/{password}")
	 public String authentification(@PathVariable String username , @PathVariable String password) {
		 return username == "admin" && password == "admin"? "bonjour admin":"sir t9wed"; }
	 @RequestMapping("/")
	 public String pass() { return " meh" ; }
	 
 }