/*
 * Copyright (c) 2016 Nike, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nike.vault.client.auth;

/**
 * Default implementation of {@link VaultCredentials} that holds a token.
 */
public class TokenVaultCredentials implements VaultCredentials {

    private final String token;

    /**
     * Explicit constructor that sets the token.
     *
     * @param token Token to represent
     */
    public TokenVaultCredentials(final String token) {
        this.token = token;
    }

    /**
     * Returns the token set during construction.
     *
     * @return Token
     */
    @Override
    public String getToken() {
        return token;
    }
}
