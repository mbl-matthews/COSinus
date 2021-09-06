<template>
  <v-container>
    <v-row>
      <v-col cols="12">
        <v-card outlined>
          <v-card-title>Offene Strafen</v-card-title>
          <v-card v-for="penalty in penalties" :key="penalty.id" class="ma-3" elevation="3" outlined>
            <v-container fluid>
            <v-row>
              <v-col cols="4" class="pa-2">{{ penalty.person }}</v-col>
              <v-col cols="4" class="pa-2">{{ penalty.date }}</v-col>
              <v-col cols="4" class="pa-2">
                <v-switch
                  v-model="penalty.done"
                  label="Beglichen"
                  readonly
                ></v-switch>
              </v-col>
            </v-row>
            <v-row>
              <v-col cols="12" class="pa-2">{{ penalty.reason }}</v-col>
            </v-row>
            <v-row>
              <v-col cols="12" class="pa-2">{{ penalty.fine }}</v-col>
            </v-row>
            </v-container>
          </v-card>
        </v-card>
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
export default {
  name: "LatestOpenPenalties",
  data () {
    return {
      penalties: [
        {
          id: 1,
          person: 'Mustermann',
          date: "2021-09-01 13:37:00",
          done: true,
          reason: "Tripped over the wi-fi cable",
          fine: "Three Access Points"
        },
        {
          id: 2,
          person: 'Mustermann',
          date: "2021-09-01 13:37:00",
          done: false,
          reason: "Used Club to mine bitcoins",
          fine: "A Bitcoin to each member"
        },
        {
          id: 3,
          person: 'Mustermann',
          date: "2021-09-01 13:37:00",
          done: false,
          reason: "Called out Thor",
          fine: "Mjölnir"
        },
        {
          id: 4,
          person: 'Mustermann',
          date: "2021-09-01 13:37:00",
          done: true,
          reason: "The number of the beast",
          fine: "666"
        },
      ],
    }
  },
}
</script>

<style scoped>

</style>