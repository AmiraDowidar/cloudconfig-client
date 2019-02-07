package pluralsight.demo.pluralsightspringcloudm2configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RateController {

    @Value("${rate}")
    String rate;

    @Value("${lanecount}")
    String lanecount;

    @RequestMapping("/rate")
    public String getRate(Model m){
        m.addAttribute("rate",rate);
        m.addAttribute("lanecount",lanecount);

        return "rateview";
    }
}
