package com.knewin.data.client.info;

import java.util.Set;

import com.google.gson.annotations.SerializedName;

/**
 * Class that stores query data to request news from web service.
 *
 * @since 1.0.0
 *
 */
public class NewsDataRequestInfo implements DataRequestInfo {

	private String key;

	private String query;

	private int offset;

	private NewsQueryFilter filter;

	@SerializedName("newsId")
	private Set<Long> newsIdList;

	private Set<String> fields;

	private String gmt;

	private boolean groupSimilar;

	private Boolean showOriginalUrl;

	private NewsQuerySort sort;

	private String defaultOperator;

	private Boolean matchedTerms;

	private String matchedTermsQuery;


	private NewsDataRequestInfo(Builder builder) {
		key = builder.key;
		query = builder.query;
		offset = builder.offset;
		filter = builder.filter;
		newsIdList = builder.newsIdList;
		fields = builder.fields;
		gmt = builder.gmt;
		groupSimilar = builder.groupSimilar;
		showOriginalUrl = builder.showOriginalUrl;
		sort = builder.sort;
		defaultOperator = builder.defaultOperator;
		matchedTerms = builder.matchedTerms;
		matchedTermsQuery = builder.matchedTermsQuery;
	}


	public NewsDataRequestInfo() {
	}


	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	public String getQuery() {
		return query;
	}


	public void setQuery(String query) {
		this.query = query;
	}


	@Override
	public int getOffset() {
		return offset;
	}


	@Override
	public void setOffset(int offset) {
		this.offset = offset;
	}


	public NewsQueryFilter getFilter() {
		return filter;
	}


	public void setFilter(NewsQueryFilter filter) {
		this.filter = filter;
	}


	public Set<Long> getNewsIdList() {
		return newsIdList;
	}


	public void setNewsIdList(Set<Long> newsIdList) {
		this.newsIdList = newsIdList;
	}


	public Set<String> getFields() {
		return fields;
	}


	public void setFields(Set<String> fields) {
		this.fields = fields;
	}


	public String getGmt() {
		return gmt;
	}


	public void setGmt(String gmt) {
		this.gmt = gmt;
	}


	public boolean isGroupSimilar() {
		return groupSimilar;
	}


	public void setGroupSimilar(boolean groupSimilar) {
		this.groupSimilar = groupSimilar;
	}


	public Boolean getShowOriginalUrl() {
		return showOriginalUrl;
	}


	public void setShowOriginalUrl(Boolean showOriginalUrl) {
		this.showOriginalUrl = showOriginalUrl;
	}


	public NewsQuerySort getSort() {
		return sort;
	}


	public void setSort(NewsQuerySort sort) {
		this.sort = sort;
	}


	public String getDefaultOperator() {
		return defaultOperator;
	}


	public void setDefaultOperator(String defaultOperator) {
		this.defaultOperator = defaultOperator;
	}


	public Boolean getMatchedTerms() {
		return matchedTerms;
	}


	public void setMatchedTerms(Boolean matchedTerms) {
		this.matchedTerms = matchedTerms;
	}


	public String getMatchedTermsQuery() {
		return matchedTermsQuery;
	}


	public void setMatchedTermsQuery(String matchedTermsQuery) {
		this.matchedTermsQuery = matchedTermsQuery;
	}


	@Override
	public String toString() {
		return "NewsDataRequestInfo [key=" + key + ", query=" + query + ", offset=" + offset + ", filter=" + filter
			+ ", newsIdList=" + newsIdList + ", fields=" + fields + ", gmt=" + gmt + ", groupSimilar=" + groupSimilar
			+ ", showOriginalUrl=" + showOriginalUrl + ", sort=" + sort + ", defaultOperator=" + defaultOperator
			+ ", matchedTerms=" + matchedTerms + ", matchedTermsQuery=" + matchedTermsQuery + "]";
	}


	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {

		private String key;

		private String query;

		private int offset;

		private NewsQueryFilter filter;

		private Set<Long> newsIdList;

		private Set<String> fields;

		private String gmt;

		private boolean groupSimilar;

		private Boolean showOriginalUrl;

		private NewsQuerySort sort;

		private String defaultOperator;

		private Boolean matchedTerms;

		private String matchedTermsQuery;


		private Builder() {
		}


		public Builder withKey(String key) {
			this.key = key;
			return this;
		}


		public Builder withQuery(String query) {
			this.query = query;
			return this;
		}


		public Builder withOffset(int offset) {
			this.offset = offset;
			return this;
		}


		public Builder withFilter(NewsQueryFilter filter) {
			this.filter = filter;
			return this;
		}


		public Builder withNewsIdList(Set<Long> newsIdList) {
			this.newsIdList = newsIdList;
			return this;
		}


		public Builder withFields(Set<String> fields) {
			this.fields = fields;
			return this;
		}


		public Builder withGmt(String gmt) {
			this.gmt = gmt;
			return this;
		}


		public Builder withGroupSimilar(boolean groupSimilar) {
			this.groupSimilar = groupSimilar;
			return this;
		}


		public Builder withShowOriginalUrl(Boolean showOriginalUrl) {
			this.showOriginalUrl = showOriginalUrl;
			return this;
		}


		public Builder withSort(NewsQuerySort sort) {
			this.sort = sort;
			return this;
		}


		public Builder withDefaultOperator(String defaultOperator) {
			this.defaultOperator = defaultOperator;
			return this;
		}


		public Builder withMatchedTerms(Boolean matchedTerms) {
			this.matchedTerms = matchedTerms;
			return this;
		}


		public Builder withMatchedTermsQuery(String matchedTermsQuery) {
			this.matchedTermsQuery = matchedTermsQuery;
			return this;
		}


		public NewsDataRequestInfo build() {
			return new NewsDataRequestInfo(this);
		}
	}

}
