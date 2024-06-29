package in.sp.main.springwebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    // @RequestMapping(value="/helloPage" , method = RequestMethod.GET)
    @GetMapping("/helloPage")
    public ModelAndView openHelloPage() {
        System.out.println("Hello World from MyController.java");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("hello");
        return mav;
    }
}
