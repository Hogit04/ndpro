package ndpro.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import ndpro.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/feedings")
@Transactional
public class FeedingController {

    @Autowired
    FeedingRepository feedingRepository;

    @RequestMapping(
        value = "/feedings/registerfeed",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public Feeding registerFeed(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody RegisterFeedCommand registerFeedCommand
    ) throws Exception {
        System.out.println("##### /feeding/registerFeed  called #####");
        Feeding feeding = new Feeding();
        feeding.registerFeed(registerFeedCommand);
        feedingRepository.save(feeding);
        return feeding;
    }

    @RequestMapping(
        value = "/feedings/addfeed",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public Feeding addFeed(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody AddFeedCommand addFeedCommand
    ) throws Exception {
        System.out.println("##### /feeding/addFeed  called #####");
        Feeding feeding = new Feeding();
        feeding.addFeed(addFeedCommand);
        feedingRepository.save(feeding);
        return feeding;
    }

    @RequestMapping(
        value = "/feedings/deletefeed",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public Feeding deleteFeed(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody DeleteFeedCommand deleteFeedCommand
    ) throws Exception {
        System.out.println("##### /feeding/deleteFeed  called #####");
        Feeding feeding = new Feeding();
        feeding.deleteFeed(deleteFeedCommand);
        feedingRepository.save(feeding);
        return feeding;
    }
}
//>>> Clean Arch / Inbound Adaptor
