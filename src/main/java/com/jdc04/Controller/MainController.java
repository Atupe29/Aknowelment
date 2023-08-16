package com.jdc04.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jdc04.Entity.OderHeader;

@RestController
public class MainController {
	@PostMapping("/save")
	public OderHeader saveOder(@RequestBody OderHeader oderHeader) {

		return null;
	}
}
