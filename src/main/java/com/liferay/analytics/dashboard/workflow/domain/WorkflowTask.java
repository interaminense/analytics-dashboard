/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.analytics.dashboard.workflow.domain;

import java.io.Serializable;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

import com.datastax.driver.core.LocalDate;

/**
 * @author Inácio Nery
 */
@Table(value = "workflowtask")
public class WorkflowTask implements Serializable {

	@PrimaryKeyColumn(ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	private String analyticskey;

	@PrimaryKeyColumn(ordinal = 1)
	private LocalDate date;

	@PrimaryKeyColumn(ordinal = 2)
	private long taskid;

	@PrimaryKeyColumn(ordinal = 3)
	private long processversionid;

	private long total;

	private long totalDuration;

	private String name;

	public LocalDate getDate() {

		return date;
	}

	public String getAnalyticskey() {

		return analyticskey;
	}

	public long getTaskid() {

		return taskid;
	}

	public long getProcessversionid() {

		return processversionid;
	}

	public String getName() {

		return name;
	}

	public long getTotal() {

		return total;
	}

	public long getTotalDuration() {

		return totalDuration;
	}

}
