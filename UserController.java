@Controller
public class UserController{

 	// 로그인 페이지로 이동
 	@RequestMapping("/user/login.do")
	public String login(){
		logger.info("경로:login");

	@RequestMapping("/user/insert.do")
	public String insert(){
		logger.info("경로:insert");