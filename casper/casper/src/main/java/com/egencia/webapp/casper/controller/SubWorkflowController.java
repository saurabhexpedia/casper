package com.egencia.webapp.casper.controller;

import com.egencia.webapp.casper.Routes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  This is an example of a sub-workflow within the app. This happens when your app has more than one main workflow and it makes sense to create additional controllers for those workflows.
 *  NOTE: method names match the name of their View, e.g. FavoriteHotelsController.index() should return views/favorite-hotels/index.hbs
 * 	@author Jordan Brennan
 */
@Controller
@RequestMapping(Routes.SUB_WORKFLOW)
public class SubWorkflowController {

    /**
     * Sub-workflow home page
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("")
    public String index(ModelMap model) throws Exception {
        // Put data on the model
        model.addAttribute("pageTitle", "Casper Sub-workflow");

        return Routes.SUB_WORKFLOW + "/index";
    }

}