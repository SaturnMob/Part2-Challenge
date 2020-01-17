package com.saturnmob.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

@RestController
@RequestMapping("/api/hook")
public class WebHookController {

	@GetMapping("getRepoTime")
	public Map<String, ?> getRepositoryCreationTime() throws ParseException, org.json.simple.parser.ParseException {
		final String gitURL = "https://api.github.com/orgs/SaturnMob/repos";
		Map map = new HashMap<>();
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(gitURL, String.class);
		Object obj = new JSONParser().parse(result);
		// typecasting obj to JSONObject
		JSONArray jo = (JSONArray) obj;
		List<WebHook> list = new ArrayList<>();
		WebHook hook = null;
		for (Object object : jo) {
			hook = new WebHook();
			JSONObject j = (JSONObject) object;
			hook.setRepoName(j.get("name").toString());
			hook.setRepoCreationTime(j.get("created_at").toString());
			list.add(hook);
		}
		map.put("Total Repo", list.size() + "");
		map.put("hook", list);
		return map;

	}
	
	@PostMapping("saveRepoTime")
	public Map<String, ?> saveRepositoryCreationTime() throws ParseException, org.json.simple.parser.ParseException {
		final String gitURL = "https://api.github.com/orgs/SaturnMob/repos";
		Map map = new HashMap<>();
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(gitURL, String.class);
		Object obj = new JSONParser().parse(result);
		// Typecasting obj to JSONObject
		JSONArray jo = (JSONArray) obj;
		List<WebHook> list = new ArrayList<>();
		WebHook hook = null;
		for (Object object : jo) {
			hook = new WebHook();
			JSONObject j = (JSONObject) object;
			hook.setRepoName(j.get("name").toString());
			hook.setRepoCreationTime(j.get("created_at").toString());
			list.add(hook);
		}
		map.put("Total Repo", list.size() + "");
		map.put("hook", list);
		return map;

	}

}
