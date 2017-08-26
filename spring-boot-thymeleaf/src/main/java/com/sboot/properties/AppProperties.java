package com.sboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties("app")
public class AppProperties {

	private String error;
	private List<Menu> menus = new ArrayList<>();

	public static class Menu {
		private String name;
		private String path;
		private String title;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getPath() {
			return path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		@Override
		public String toString() {
			return "Menu{" + "name='" + name + '\'' + ", path='" + path + '\'' + ", title='" + title + '\'' + '}';
		}
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	@Override
	public String toString() {
		return "AppProperties{" + "error='" + error + '\'' + ", menus=" + menus + '}';
	}
}
