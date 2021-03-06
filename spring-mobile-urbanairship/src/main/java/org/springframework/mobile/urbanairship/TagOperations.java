/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.mobile.urbanairship;

import java.util.List;

public interface TagOperations {

	List<String> getTags();
	
	List<String> getTags(String deviceToken);

	void createTag(String tagName);

	void createTag(String deviceToken, String tagName);

	void modifyTagTokens(String tagName, List<String> tokensToAdd, List<String> tokensToRemove);
	
	void modifyTagPins(String tagName, List<String> pinsToAdd, List<String> pinsToRemove);

	void modifyTagAppIds(String tagName, List<String> idsToAdd, List<String> idsToRemove);

	void removeTag(String deviceToken, String tagName);

	void removeTags();

}
