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

import org.springframework.shell.component.view.control.View;
import org.springframework.shell.component.view.control.ViewService;
import org.springframework.shell.component.view.event.EventLoop;
import org.springframework.shell.style.ThemeResolver;

/**
 * {@link Scenario} participates in a catalog showcase.
 *
 * @author Janne Valkealahti
 */
public interface Scenario {

	// Common category names
	public static final String CATEGORY_ALL = "All Scenarios";
	public static final String CATEGORY_LISTVIEW = "ListView";
	public static final String CATEGORY_BOXVIEW = "BoxView";
	public static final String CATEGORY_LAYOUT = "Layout";
	public static final String CATEGORY_OTHER = "Other";

	/**
	 * Build a {@link View} to be shown with a scenario.
	 *
	 * @return view of a scenario
	 */
	View build();

	/**
	 * Configure scenario.
	 *
	 * @param eventloop eventloop for scenario
	 * @param themeResolver theme resolver for scenario
	 * @param themeName theme name for scenario
	 * @return scenario for chaining
	 */
	Scenario configure(ViewService viewService, EventLoop eventloop, ThemeResolver themeResolver, String themeName);

}
