package jp.gr.java_conf.kmine27.spring.kotlin.sample.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import jp.gr.java_conf.kmine27.spring.kotlin.sample.domain.Person

@RestController
class IndexController {
	@RequestMapping("/")
	fun index(): String = "Hello world !"
	@RequestMapping("/person")
	fun person(): Person {
		return Person()
	}

}
