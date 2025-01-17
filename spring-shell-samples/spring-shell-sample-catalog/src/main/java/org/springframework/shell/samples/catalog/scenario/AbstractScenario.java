/*
 * Copyright 2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.shell.samples.catalog.scenario;

import org.springframework.shell.component.view.control.AbstractView;
import org.springframework.shell.component.view.control.ViewService;
import org.springframework.shell.component.view.event.EventLoop;
import org.springframework.shell.style.ThemeResolver;

/**
 * Base implementation of a {@link Scenario} helping to avoid some bloatware.
 *
 * @author Janne Valkealahti
 */
public abstract class AbstractScenario implements Scenario {

	private ViewService viewService;
	private EventLoop eventloop;
	private ThemeResolver themeResolver;
	private String themeName;

	@Override
	public Scenario configure(ViewService viewService, EventLoop eventloop, ThemeResolver themeResolver, String themeName) {
		this.viewService = viewService;
		this.eventloop = eventloop;
		this.themeResolver = themeResolver;
		this.themeName = themeName;
		return this;
	}

	protected ViewService getViewService() {
		return viewService;
	}

	protected EventLoop getEventloop() {
		return eventloop;
	}

	protected ThemeResolver getThemeResolver() {
		return themeResolver;
	}

	protected String getThemeName() {
		return themeName;
	}

	protected void configure(AbstractView view) {
		view.setEventLoop(getEventloop());
		view.setThemeResolver(getThemeResolver());
		view.setThemeName(getThemeName());
	}
}
