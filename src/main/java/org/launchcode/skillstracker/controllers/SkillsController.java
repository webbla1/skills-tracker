package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping("")
    @ResponseBody
    public String skillsGreeting() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
        }

    @GetMapping("form")
    @ResponseBody
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form action='fav' method='post' >" + //submit a request to /fav
                "<p>Enter your name</p>" +
                "<input type='text' name='name'>" +
                "<label for='skills'></label>" +
                "<p>My favorite language</p>" +
                "<select name='skill1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<p>My second favorite language</p>" +
                "<select name='skill2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<p>My third favorite language</p>" +
                "<select name='skill3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }


    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "fav")
    @ResponseBody
    public static String createMessage(@RequestParam String name, @RequestParam String skill1, @RequestParam String skill2, @RequestParam String skill3) {
        return "<h1>"+ name + "</h1>" +
                "<ol>" +
                "<li>" + skill1 + "</li>" +
                "<li>" + skill2 + "</li>" +
                "<li>" + skill3 + "</li>" +
                "</ol>";
    }
}
