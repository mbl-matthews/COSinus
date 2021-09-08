<template>
  <v-app>
    <v-app-bar
      app
      color="primary"
      dark
    >
      <v-app-bar-nav-icon @click="drawer = true"></v-app-bar-nav-icon>
      <div class="d-flex align-center">
        <v-img
          alt="Vuetify Logo"
          class="shrink mr-2"
          contain
          src="@/assets/cosinus_logo_little_white.png"
          transition="scale-transition"
          width="170"
        />
      </div>

      <v-spacer></v-spacer>

      <v-btn
        target="_blank"
        text
      >
        <span class="mr-2">Logout</span>
        <v-icon>mdi-logout</v-icon>
      </v-btn>
    </v-app-bar>
    <v-navigation-drawer
        v-model="drawer"
        absolute
        temporary
    >
      <v-list
          nav
          dense
      >
        <v-list-item>
          <img
              :src="require('./assets/cosinus_logo_little_white.png')"
              width="200"
          >
        </v-list-item>

        <v-divider></v-divider>

        <v-list-item-group
            v-model="group"
            active-class="deep-purple--text text--accent-4"
        >
          <v-list-item
              v-for="item in items"
              :key="item.title"
              :to="item.route"
              link
              color="#34924f"
          >
            <v-list-item-icon>
              <v-icon color="#c3ccd9">{{ item.icon }}</v-icon>
            </v-list-item-icon>

            <v-list-item-content>
              <v-list-item-title class="greyTxt">{{ item.title }}</v-list-item-title>
            </v-list-item-content>
          </v-list-item>
        </v-list-item-group>
      </v-list>
    </v-navigation-drawer>

    <v-main>
      <router-view/>
    </v-main>
  </v-app>
</template>

<script>

export default {
  name: 'App',

  data: () => ({
    drawer: false,
    group: null,
    items: [
      {title: 'Home', icon: 'mdi-home', route: '/'},
      {title: 'Cash Register', icon: 'mdi-account-cash', route: '/cashregister'},
      {title: 'About', icon: 'mdi-account', route: '/about'},
    ]
  }),
};
</script>
