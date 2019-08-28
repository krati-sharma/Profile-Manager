package com.mess.Mes.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialLink;

public class Dash extends Composite  {

	private static DashUiBinder uiBinder = GWT.create(DashUiBinder.class);

	interface DashUiBinder extends UiBinder<Widget, Dash> {
	}

	public Dash() {
		initWidget(uiBinder.createAndBindUi(this));
		
		
		
		
		
		ML2.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				History.newItem("ctt");
				Myspace.getInstance().koifunct();
			}
		});
		
		ML3.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get().clear();
				Cadre j=new Cadre();
				RootPanel.get().add(j);
			}
		});
	}

	@UiField
	MaterialImage h2;
	
	

    
    
    
    @UiField
    MaterialLink ML2;
    
    @UiField
    MaterialLink ML3;

}
