package com.tarcisiolopes.moneyapi.event.listener;

import java.net.URI;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.tarcisiolopes.moneyapi.event.RecursoCriadoEvent;

@Component
public class RecursoCriadoListener implements ApplicationListener<RecursoCriadoEvent>{

	@Override
	public void onApplicationEvent(RecursoCriadoEvent recursoCriadoEvent) {
		HttpServletResponse response = recursoCriadoEvent.getResponse();
		Integer id = recursoCriadoEvent.getId();
		
		adicionarHeaderLocation(response, id);
			
	}

	private void adicionarHeaderLocation(HttpServletResponse response, Integer id) {
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
				.buildAndExpand(id).toUri();
			response.setHeader("Location", uri.toASCIIString());
	}

}
