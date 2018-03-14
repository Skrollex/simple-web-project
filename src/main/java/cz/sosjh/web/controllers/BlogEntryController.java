package cz.sosjh.web.controllers;

import cz.sosjh.web.repository.BlogRepository;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogEntryController {

    @GetMapping(path = "/blog-entries/{BlogEntryId}", produces = MediaType.TEXT_HTML_VALUE)
    public String getBlogEntry(@PathVariable("BlogEntryId") String id, Model model) {
        model.addAttribute("entry" , BlogRepository.get(id));
        return "blog-entry";
    }
}
