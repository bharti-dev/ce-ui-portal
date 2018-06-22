/**
 * 
 */
package com.binji.common.domain;

/**
 * @author amit.bharti
 *
 */
public class Paged<T> extends BaseDomain {

	private static final long serialVersionUID = 1L;
	
	private T[] content;
	private int pageIndex;
	private int[] nElements;
	private SortOrder sort;
	private boolean isFirst;
	private boolean isLast;
	private int pageSize;
	private int totalElements;
	private int totalPages;

	public T[] getContent() {
		return content;
	}

	public void setContent(T[] content) {
		this.content = content;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int[] getnElements() {
		return nElements;
	}

	public void setnElements(int[] nElements) {
		this.nElements = nElements;
	}

	public SortOrder getSort() {
		return sort;
	}

	public void setSort(SortOrder sort) {
		this.sort = sort;
	}

	public boolean isFirst() {
		return isFirst;
	}

	public void setFirst(boolean isFirst) {
		this.isFirst = isFirst;
	}

	public boolean isLast() {
		return isLast;
	}

	public void setLast(boolean isLast) {
		this.isLast = isLast;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
}
